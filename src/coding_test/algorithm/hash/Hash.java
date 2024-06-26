package coding_test.algorithm.hash;

// 기본적인 해시 테이블 구현
public class Hash{

    // Hash Table
    public Slot[] hashTable;    // 배열 형태로 선언

    // Hash 객체를 생성할 때 table 사이즈 지정
    public Hash(Integer size) {
        this.hashTable = new Slot[size];
    }

    // Slot 에는 value를 가짐
    public class Slot {
        String value;

        Slot(String value) {
            this.value = value;
        }
    }

    // Hash function
    public int hashFunction(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;   // 나머지
    }

    // 입력 받은 key를 해시 함수로 인덱스화 하고, 해당 인덱스에 value 저장
    public boolean saveData(String key, String value) {
        // key 는 해시 함수를 거쳐서 해시 값(해시, 해시주소)를 반환 -> 여기선 배열의 index 와 동일
        Integer address = this.hashFunction(key);

        if (this.hashTable[address] != null ) { // 해당 주소에 이미 데이터가 있을 경우
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }

        return true;
    }

    // key 에 해당하는 값을 반환
    public String getData(String key) {
        // key는 해시 함수를 거쳐서 해시 값(해시, 해시 주소)를 반환
        Integer address = this.hashFunction(key);

        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Hash myHash = new Hash(20);

        myHash.saveData("Lee","30000");
        myHash.saveData("James","15000");
        myHash.saveData("Denny","5000");

        System.out.println(myHash.getData("Lee"));      // 30000
        System.out.println(myHash.getData("James"));    // 15000
        System.out.println(myHash.getData("Denny"));    // 5000
    }

}

