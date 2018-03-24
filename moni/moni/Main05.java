package moni;

public class Main05 {
	//组合数字
	static long test(int a[], int n) {
		long ret = 0;
		for (int i = 0; i < n; ++i) {
			int tp = a[i];
			int j = 1;
			while(tp != 0) {
				j *= 10;
				tp /= 10;
			}
			ret = ret * j + a[i];
		}
		return ret;
	}
	static long f(int a[], int k) {
		if (k == 6) {
			return test(a, k);
		}
		long ret = 0;
		for(int i = k; i < 6; ++i) {
			int t = a[k];
			a[k] = a[i];
			a[i] = t;				//Integer.parseInt((a[i]+"").substring(1))
			ret = Math.max(ret,f(a,k+1));	  /*在这里填写必要的代码*/
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] a = {517, 283, 429, 65, 6566, 32};
		System.out.println(f(a, 0));
	}
}
