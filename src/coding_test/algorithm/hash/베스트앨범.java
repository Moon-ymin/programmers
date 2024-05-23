package coding_test.algorithm.hash;
// https://coding-grandpa.tistory.com/79

import java.util.Arrays;
import java.util.HashMap;

class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        MusicInfo[] musicInfo = new MusicInfo[genres.length];
        HashMap<String, GenreInfo> map = new HashMap<>();
        GenreInfo[] genreInfo;

        // 1. musicInfo array & Genre HashMap
        for (int i = 0; i < genres.length; i++) {
            // musicInfo
            musicInfo[i] = new MusicInfo();
            musicInfo[i].id = i;
            musicInfo[i].genre = genres[i];
            musicInfo[i].playcount = plays[i];

            // HashMap
            if (!map.containsKey(genres[i])) {
                GenreInfo genre = new GenreInfo(genres[i]);
                map.put(genres[i], genre);
            }
        }

        // 2. Sort Music info by playcount, descending
        Arrays.sort(musicInfo);

        // 3. Fill HashMap with count and top two
        for(MusicInfo music : musicInfo) {
            GenreInfo genre = map.get(music.genre);
            genre.sum += music.playcount;

            if (genre.count < 2) {
                genre.index[genre.count] = music.id;
            }
            genre.count++;
        }

        // 4. HashMap to array and sorting
        genreInfo = new GenreInfo[map.size()];
        int idx = 0;
        int musicCount = 0;

        for (String key : map.keySet()) {
            genreInfo[idx] = map.get(key);
            musicCount += Math.min(genreInfo[idx].count, 2);
            idx++;
        }
        Arrays.sort(genreInfo);

        // 5. Make answer array
        answer = new int[musicCount];
        idx = 0;
        for(GenreInfo genre : genreInfo) {
            int limit = Math.min(genre.count, 2);
            for (int i = 0; i < limit; i++, idx++) {
                answer[idx] = genre.index[i];
            }
        }
        return answer;
    }
}

class GenreInfo implements Comparable<GenreInfo> {
    String genre;
    int sum;
    int count;
    int[] index = new int[2];

    GenreInfo(String genre) {
        this.genre = genre;
        sum = 0;
        count = 0;
        index[0] = -1;
        index[1] = -1;
    }

    int getSum() {
        return sum;
    }
    @Override
    public int compareTo(GenreInfo other){
        int compareTotal = ((GenreInfo)other).getSum();
        return compareTotal - this.sum; // 내림차순 정렬
    }
}

class MusicInfo implements Comparable<MusicInfo> {
    int id;
    String genre;
    int playcount;

    int getPlaycount() {return playcount;}

    @Override
    public int compareTo(MusicInfo other) {
        int compareTotal = other.getPlaycount();

        return compareTotal - this.playcount;
    }
}


