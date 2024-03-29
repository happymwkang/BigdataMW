package model;

import model.domain.People;

public class PeopleModel {
	//DB와 같은 저장소
	private static People[] allData = new People[5];
	private static int index;//0초기화
	//test 데이터 저장
	//byte code가 로딩될때 자동으로 실행되는 특화된 코드
	static {
		allData[0] = new People("변영인", 27);
		allData[1] = new People("최성국", 29);
		allData[2] = new People("박현민", 28);
		index = 3;
	}
	//가입
	/* People 객체가 배열에 저장되는게 가입
	 * 개발 방식
	 * 경우의 수 1 : name, age를 각자 argument로 받아서 People객체 생성후 배열에 저장
	 * 경우의 수 2 : People 객체를 argument 로 받아서 배열에 저장 */
	public static boolean insert(People v) {//insert()
		if(index < 5) {
//			allData[index] = v;
//			index++;
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}
	//삭제
	/* 발생 가능한 경우의 수
	 * 1. 없는 데이터를 삭제 요청
	 * 	- 
	 * 2. 존재하는 데이터 삭제 요청
	 * - 삭제
	 * - 삭제시에 배열의 내용 삭제
	 * 	1. 마지막 index의 데이터 삭제
	 * 		- index : --
	 *  2. 중간 index에 존재하는 데이터 삭제
	 *  	- 5개가 다 저장되어 있으나  index 2인 데이터 3번째 삭제 요청
	 *       : index 2에 데이터 삭제후 재정렬?
	 *       : index 2에 기본 default로 할 것인지?(마지막 선택)
	 *       	- 모든 사람 정보 검색시 index 2영역의 데이터를 제외하고 출력
	 *       	- 발생 가능한 경우의 수
	 *       		1. 실행시 없는 객체의 내용값 활용(출력) 시도시 실행 에러 발생
	 *       		2. 코드로 존재 여부 검증 후 출력  
	 * 3. 구현 : 이름으로 삭제 요청
	 * 	- 이름이 존재하는지 확인
	 * 	1. 배열의 데이터를 하나하나 반환해서 이름만 반환 : 반복
	 *  2. 반환된 이름을 parameter로 유입된 변수값과 비교
	 *  3. 동일함
	 *  	- 삭제 후 true return
	 *  	- 반복 종료
	 *  4. 동일하지 않은 경우 즉 없는 경우엔 false return  
	 *  5. 조건식1 && 조건식2
	 *  	- 두 조건식 모두 true인 경우 해당 {} 실행
	 *  	- 장점
	 *  		조건식1 이 false인 경우 어차피 {} 실행 안 할것이기 때문에 두번째
	 *  		조건식은 검증 자체를 안함
	 * 		- 빠른 연산자
	 * 	6. 조건식1 & 조건식2
	 * 		- 조건식 1 이 false인 경우 조건식2는 실행 안 함
	 *  */
	public static boolean delete(String name){
		People v = null;
		for(int i=0; i < allData.length; i++) {//  i < 5
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}			
		}
		return false;		
	}
	public static boolean delete2(String name){
		for(int i=0; i < allData.length; i++) {//  i < 5
			if(allData[i] != null && allData[i].getName().equals(name)) {
				allData[i] = null;
				return true;
			}			
		}
		return false;		
	}
	
	
	
	//수정
	
	
	//한사람 정보만 검색
	
	//모든 사람들 검색
	/* 단순하게 배열 자체를 반환 - Controller가 받아서 View에게 출력을 위임 */
	public static People[] getAll() {
		return allData;
	}
	
	
	
	
	
	
	//개발시 PeopleModel의 단순 확인용 즉 단위테스트 용으로 적용, 차후엔 삭제 예정
	public static void main(String [] args) {
		System.out.println(2);
	}
}

/*
 * 1. 기능
 * 	저장, 수정, 삭제, 검색(모든 사람, 한 사람)
 * 2. 구현
 * 	- 메소드는 5개
 * 3. 배열에 People들을 저장
 * 	- 배열은 멤버 변수? 각 메소드의 로컬 변수?
 * 		- 멤버 변수
 *  - 멤버 변수 : 모든 메소드에서 공유
 *  - 로컬 변수 : 메소드 실행중에만 사용 즉 다른 메소드와 공유 불가
 *  
 * 4. 개발 관점
 * 	1. test용  People 객체 : 5개로 제한
 *  2. static으로 배열생성? non-static?
 *  	- static변수 : byte code가 메모리에 저장(적재, 로딩)될때 자동 생성
 *  	- static인 경우 
 *  		- 외부에서 이 데이터를 사용할때 이 변수를 보유한 클래스의 객체 생성 불필요
 *  		- PeopleModel 객체 생성 불필요
 *  		- PeopleModel 보유한 모든 메소드를 static 처리
 *   
 *  	- non-static인 경우
 *  		- 외부에서 이 데이터를 사용할때 이 변수를 보유한 클래스의 객체 생성 필수
 *  		- PeopleModel 객체 생성 필수
 *  		- PeopleModel이 보유한 모든 메소드는 static 처리 불필요
 *  		- user(end user)수에 대한 수는 제한이 없는데...설계가 어설플 경우 요청시 마다 
 *  		PeopleModel 객체 생성
 */













