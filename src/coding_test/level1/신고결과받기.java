package coding_test.level1;

// 신고 결과 받기 : https://school.programmers.co.kr/learn/courses/30/lessons/92334
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 유저가 신고당한 횟수 기록
        HashMap<String, Integer> warningCount = new HashMap<>();
        // 각 유저가 신고한 유저 목록 기록 : HashMap 의 Value를 Set 형태로 만들어 중복 신고 방지
        HashMap<String, HashSet<String>> reportedBy = new HashMap<>();

        // 중복된 신고 제거하여 신고당한 횟수와 신고한 유저 목록 기록
        for (String reportStr : report) {
            String[] reportInfo = reportStr.split(" ");
            String reporter = reportInfo[0];
            String reported = reportInfo[1];

            if (!reportedBy.containsKey(reported)) {
                reportedBy.put(reported, new HashSet<>());
            }
            if (reportedBy.get(reported).add(reporter)) { // 중복 신고인 경우만 신고당한 횟수 증가
                warningCount.put(reported, warningCount.getOrDefault(reported, 0) + 1);
            }
        }

        // 정지된 유저 목록 기록
        HashSet<String> stoppedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : warningCount.entrySet()) {
            if (entry.getValue() >= k) {
                stoppedUsers.add(entry.getKey());
            }
        }

        // 각 유저가 받은 메일 수 계산
        HashMap<String, Integer> mailCount = new HashMap<>();
        for (Map.Entry<String, HashSet<String>> entry : reportedBy.entrySet()) {
            String reported = entry.getKey();
            HashSet<String> reporters = entry.getValue();
            for (String reporter : reporters) {
                if (stoppedUsers.contains(reported)) {
                    mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        // 결과 배열 생성
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}

