public class Coin {
        private int value;
        //    생성자를 통해서만 데이터 입력 가능
        public Coin(int value) {
            this.value = value;
        }
        //     value 필드의 값을 외부로 출력하기 위해 존재하는 getter
        public int getValue() {
            return this.value;
        }
    }

