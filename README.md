# JavaProgramming 자주쓰고 헷갈리는 문법
---------------------------------
### 문자열변환
##### 문자로 수를 받고 원하는 형식으로 변환 
```
int 변수1 = Integer.parseInt(변수2);         //문자열 변수2를 정수형 변수1로 변환
double 변수1 = Double.parseDouble(변수2);    //문자열 변수2를 실수형 변수1로 변환
boolean 변수1 = Boolean.parseBoolean(변수2); //문자열 뱐수2를 블륨형 변수1로 변환

ex) String num = "54";
    int CH = Integer.parseInt(num);
```

------------------------------------

### 클래스 함수 배열 객체 생성
```
class [] 변수명 = new class[개수];
변수명[i] = new class();
```
### String class의 대표적 메소드
##### 문자열 비교
```
A.equals(B); //A가 B와 같으면 True, 다르면 False
```
##### 문자열 특정 위치 반환
```
A.charAt(num); //A문자열의 num번째의 문자
```
##### 문자열 길이 비교
```
A.compareTo(B); //문자열길이 B - A
```
##### 문자열 포함
```
A.contaions(B); //B라는 문자가 A안에 포함되어 있는가
```
##### 문자열 끝 확인
```
A.endsWith(B); //A문자열이 B로 끝나는가
```
##### 문자열 추출
```
A.substring(num1,num2); //A문자열의 num1번째부터 num2까지 뜯어서 새로운 문자열로
```
##### 문자 위치 바꾸기
```
A.replace(B,C); //A문자열의 B부분을 C로 바꾼다.
```
##### 문자열 분리
```
문자형 [] 변수 = A.split("b"); //A문자열에서 b기준으로 잘라 저장
```

-----------------------------------
### 반복문
##### for each문
```
for(문자열 변수 : 배열);
=> 변수에 배열하나씩 
```
----------------------------------
### Switch문
```
switch(변수){
  case (조건):
  break;
  default :
  break;
}
```
------------------------------------
### enum
##### 선언
```
enum ABC {LG,SAMSUNG}; //ABC 변수안에 LG, SAMSUNG 생성
ABC COMPANY = ABC.LG; //COMPANY변수에 LG값 선언
```
##### 문자열에 선언
```
String COMPANY = ABC.LG.toString(); //COMPANY문자열에 LG값 선언
```
##### 문자열을 enum형으로
```
ABC COMPANY = ABC.valueOf(입력값); //입력값에 해당하는 enum 값을 COMPANY에
```
##### 값 추출
```
ABC.values() //enum값 모두 추출
ABC.valueOf("LG") //enum의 원하는 객체 추출
```
