package tp3;

public class MultiploXY {

		public int mayorMultiplo (int x, int y) {
			
			int mcm = minimoComunMultiplo (x, y);
			
			if (mcm > 1000) return -1;
		    int a = 1000 / mcm;
		    return a * mcm;
		}

		private int minimoComunMultiplo(int x, int y) {
			
			return (x * y) / minimoComunDivisor(x, y);
		}

		private int minimoComunDivisor(int x, int y) {
			
			while (y != 0) {
				int temporal = y;
	            y = x % y;
	            x = temporal;
	        }
	        return x;
		}
}
