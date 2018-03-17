package java2014;

public class Main12 {
	/*
	小明从银行贷款3万元。约定分24个月，以等额本金方式还款。

	这种还款方式就是把贷款额度等分到24个月。每个月除了要还固定的本金外，还要还贷款余额在一个月中产生的利息。

	假设月利率是：0.005，即：千分之五。那么，

	第一个月，小明要还本金 1250, 还要还利息：30000 * 0.005，总计 1400.00
	第二个月，本金仍然要还 1250, 但利息为：(30000-1250) * 0.005 总计 1393.75

	请问：小明在第15个月，应该还款多少（本金和利息的总和）？

	请把答案金额四舍五入后，保留两位小数。注意：32.5，一定要写为：32.50

	通过浏览器提交答案，这是一个含有小数点和两位小数的浮点数字。不要写多余内容（例如：多写了“元”或添加说明文字）
	答案：1312.50
	*/
	public static void main(String[] args) {
		double s=0.005;
		System.out.println((30000-1250*14)*s+1250);
	}
}