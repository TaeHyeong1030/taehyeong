package chapter_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능 (숫자 불가능)
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 변수는 소 문자로 시작, 2개 이상 단어를 사용하면 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "자바" ; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2024-04-01"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "ar103"; // 항공 편명
        String _flightNo = "ar103"; // 밑줄 시작
        String flight_no_2 = "ar103"; // 밑줄과 숫자 포함
        // String -flightNo = "ar103";

        int accompany = 2; // 동반 가족 수
        int lengthOfstay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "전자제품";

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)

        int i = 0;
        String s = "";
        String str = "";

    }
}
