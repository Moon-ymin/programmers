package coding_test.algorithm.hash;

import java.util.HashMap;

class 전화번호목록 {
    public boolean solution(String[] phone_book) {

        // 1. HashMap 선언
        HashMap<String, Integer> contacts = new HashMap<>();

        // 2. 모든 전화번호 HashMap 에 넣기
        for (int i = 0; i < phone_book.length; i++) {
            contacts.put(phone_book[i], 1); // 중복되는 전화번호는 없다고 했기 때문에
        }

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {  // j 크기를 한 개의 전화번호 전체로 하지않고(전체로하면 자기 자신도 포함되어 버려서), 1개 작게 확인하는 것
                if (contacts.containsKey(phone_book[i].substring(0, j))) return false;
            }
        }
        return true;
    }
}
