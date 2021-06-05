package kodlama.io.northwind.core.utilities.result;

public class ErrosDataResult <T> extends DataResult<T>{
	 

		public ErrosDataResult(T data, String message) {
			super(data, false, message);
		}
		
		public ErrosDataResult(T data) {
			super(data,false);
		}

		public ErrosDataResult( String message) {
			super(null, false, message);
		}
		
		public ErrosDataResult() {
			super(null, false);
		}
}
