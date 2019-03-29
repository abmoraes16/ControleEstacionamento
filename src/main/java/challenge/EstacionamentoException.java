package challenge;

public class EstacionamentoException extends RuntimeException {

        public EstacionamentoException(){
            super();
        }

        public EstacionamentoException(String msg, Throwable cause){
            super(msg, cause);
        }
}
