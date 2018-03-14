package java2017;

import java.util.HashSet;
import java.util.Set;
/**
 * 思路：Ctrl+f把0替换或者去掉
 * 利用set集合不重复，保存a,b中相同的学号
 * 利用set集合把与c中重复的remote掉
 * @author zhangbiao
 *
 */
public class Main02 {
	/*
	标题：兴趣小组
	为丰富同学们的业余文化生活，某高校学生会创办了3个兴趣小组
	（以下称A组，B组，C组）。
	每个小组的学生名单分别在【A.txt】,【B.txt】和【C.txt】中。
	每个文件中存储的是学生的学号。
	由于工作需要，我们现在想知道：
	    既参加了A组，又参加了B组，但是没有参加C组的同学一共有多少人？
	请你统计该数字并通过浏览器提交答案。
	注意：答案是一个整数，不要提交任何多余的内容。
	*/
	public static void main(String[] args) {
		int[] a=new int[]{
				12894792, 92774113, 59529298, 22962224, 92991699, 83349521, 87365945, 
				49818286, 16499628, 39475245, 55933381, 76949287, 61366748, 95631228, 
				17192313, 59682833, 61562613, 87992524, 83962919, 51743442, 61977899, 
				32919762, 69689621, 87179571, 81761697, 32364296, 97833271, 36198935, 
				26588918, 84946668, 43959468, 73191775, 56794191, 99454789, 11141939, 
				19998994, 35972237, 44945158, 53959989, 75758119, 18569273, 35891494, 
				42192559, 22496415, 93981786, 34593672, 13974995, 97733442, 42374678, 
				23452597, 98586743, 39771281, 17793989, 52123562, 95898131, 56698981, 
				99758589, 18238892, 18217979, 94511837, 75682969, 31135682, 55379996, 
				42224598, 98263979, 49228312, 28924663, 11589163, 25686441, 45944928, 
				96731692, 53675999, 93854194, 14858183, 16866794, 49677997, 73141512, 
				32317341, 56641725, 43123949, 15291174, 62389959, 72887983, 76869787, 
				61946319, 96923746, 17874548, 46928629, 19577743, 48747364, 95328789, 
				59855415, 69965266, 29592696, 14471297, 79896866, 46938647, 33575829, 
				53426294, 56993931, 51326542, 94959481, 89114917, 33919593, 72971538, 
				22497422, 17395672, 78974338, 93299269, 83461794, 41247821, 26118961, 
				19657376, 42198957, 15338224, 59284714, 32232841, 26716521, 76948344, 
				23676625, 62897799, 69296551, 59653393, 38794399, 48481614, 69782897, 
				26859668, 37471953, 88729989, 51919849, 94951571, 69924611, 29898329, 
				79377786, 13899299, 99683688, 58218284, 46792829, 97221799, 45286643, 
				48158629, 57367298, 26993491, 76999414, 87927949, 99926739, 91598757, 
				15191191, 62491849, 43892529	
		};
		
		int[] b=new int[]{
				44894959, 34662733, 44141729, 92774113, 99298727, 91919833, 23727681, 
				19993499, 55933381, 54443275, 13584792, 96523685, 59682833, 61562613, 
				62389975, 29311684, 93299452, 23191945, 42192889, 28992561, 18469278, 
				19186537, 58465391, 91111966, 62689429, 23721241, 29277631, 91798977, 
				57514737, 93981786, 81541612, 97346443, 93154698, 19799455, 37446968, 
				17793989, 72378958, 66299696, 39619382, 89586343, 33152171, 67949939, 
				35696683, 63242965, 99948221, 96233367, 52593493, 98263979, 91418923, 
				74816795, 89375949, 58495334, 96731692, 84989545, 16866794, 94737626, 
				91673442, 79548494, 13638168, 98163691, 11196566, 64375392, 49267992, 
				99897795, 56447313, 54532235, 94738425, 66642634, 83219544, 49546996, 
				66924991, 29592696, 96937599, 73434467, 79896866, 91925618, 57892991, 
				98487641, 32599982, 84412833, 23311447, 38389499, 79957822, 72971538, 
				69645784, 91863314, 73999999, 93299269, 83461794, 81378487, 39423273, 
				22233715, 32232841, 26716521, 93511221, 29196547, 58263562, 56233395, 
				52547525, 55812835, 87253244, 52484232, 89837369, 94998464, 52928151, 
				53267591, 66381929, 84381316, 59788467, 99683688, 67982998, 71695255, 
				89654964, 21434397, 45286643, 76556656, 82465821, 57367298, 79218989, 
				48469468, 59179479, 46946391, 43943164, 96544499, 83349521, 79837892, 
				18926791, 49818286, 28936392, 11489524, 51931183, 73869337, 13241219, 
				99925448, 19718828, 76369986, 26931696, 76558953, 97726139, 46473415, 
				48496387, 23625539, 86756912, 35164187, 49161392, 78982834, 35972237, 
				98692486, 29815841, 56562216, 77684187, 81751794, 29169464, 59497962, 
				27786415, 19893526, 99934129, 37759498, 52636463, 25666982, 43262852, 
				38393436, 92581136, 29323259, 56959657, 95898131, 95286262, 75574581, 
				54957961, 96793896, 99758589, 57782642, 34492535, 41919697, 96395464, 
				19993599, 81212949, 34917532, 69569396, 99999936, 57129619, 67491593, 
				71944918, 62976698, 29533873, 71936325, 86874388, 26545932, 35695544, 
				39433724, 53127345, 72887983, 25399873, 63711546, 96923746, 27783723, 
				33199575, 35929698, 16491251, 18276792, 62744775, 92996155, 96336579, 
				56141974, 73997273, 31416832, 99171957, 64176982, 46938647, 58469388, 
				69972926, 73724394, 27435484, 51568616, 15531822, 47788699, 11818851, 
				41594694, 83561325, 43197163, 56965375, 19557343, 26118961, 74659126, 
				99976467, 19657376, 49991436, 93425162, 61164599, 15797769, 95427896, 
				14444984, 36795868, 18979449, 59653393, 72942548, 96763977, 33895619, 
				94892653, 12985268, 65174149, 79567366, 23929126, 74299947, 13498869, 
				21696323, 27724594, 54941993, 38229841, 97959968 
		};
		
		int[] c=new int[]{
				13494991, 39952424, 47847739, 94939581, 13899959, 79966943, 11161555, 
				17192313, 47979425, 59682833, 74154313, 61562613, 93299452, 37193342, 
				18479435, 32592597, 36198935, 54219919, 73191775, 48358178, 85544593, 
				95996766, 54651623, 52113229, 27465181, 23871783, 22496415, 54197941, 
				65899695, 56528799, 82671199, 61176934, 42374678, 51612628, 63329997, 
				56591652, 94552733, 12789324, 89586343, 51935914, 38611966, 43916499, 
				79996959, 98263979, 91418923, 65345949, 21734275, 76846198, 71596239, 
				99833171, 67128139, 41367555, 64769519, 44919799, 16475199, 93164325, 
				99386162, 95324941, 89688223, 67629139, 79552617, 76219736, 59368644, 
				45996921, 54972488, 63779911, 28862942, 73145521, 74978695, 66924991, 
				12896859, 92171991, 79896866, 73434467, 98487641, 44415925, 32599982, 
				84412833, 83896188, 52243759, 49191419, 38744339, 48979796, 44937932, 
				96267591, 81866886, 38575984, 25978688, 78974338, 41247821, 12356966, 
				64842393, 79127158, 92366944, 68999579, 12426275, 96499239, 99795972, 
				98266593, 83829884, 98831897, 43273398, 23216195, 29196547, 95169161, 
				95553537, 52182214, 32641346, 91553427, 24436596, 77433749, 91979664, 
				52928151, 88985343, 91761499, 76293988, 63237368, 23495334, 59788467, 
				99683688, 67755443, 29946533, 12953693, 99437479, 15299939, 45286643, 
				93537527, 82465821, 57367298, 53899751, 15354933, 97769839, 68933762, 
				89229545, 91892759, 39868288, 21524323, 69716619, 65983815, 78948499, 
				93227391, 83349521, 87365945, 71729254, 51931183, 89168555, 98593928, 
				37986236, 25193957, 87992524, 22898816, 89928999, 99741678, 15993372, 
				99117982, 49938176, 21755983, 86993426, 87839263, 53959989, 75758119, 
				59781354, 58679691, 25666982, 56397643, 47189521, 62776522, 78136698, 
				44882734, 99758589, 98975999, 66393819, 23489347, 11589163, 87989118, 
				18329165, 92514163, 89494632, 92377859, 93912329, 17499963, 59699979, 
				79876366, 63894897, 37857991, 86993935, 99987123, 29433345, 89298948, 
				61531153, 61946319, 37839841, 19421134, 48747364, 35196916, 62484573, 
				59997979, 36845792, 21631642, 72739317, 26283799, 89114917, 76639399, 
				29154119, 35159758, 47788699, 11818851, 56529669, 36396767, 36931167, 
				83817428, 19657376, 99976467, 14676452, 11924569, 16327695, 76948344, 
				14444984, 95452911, 99612346, 65172562, 84813675, 88618282, 38794399, 
				27998914, 63859911, 33787595, 69924611, 16229889, 13899299, 35249335, 
				29173227, 45936451, 66177893, 82658333, 43199739, 44529187, 74299947, 
				85913538, 99926739, 27724594, 95148523, 29593999, 64399997, 26996953, 
				98116293, 97457666, 29917396, 94634371, 79791589
		};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if((a[i]==b[j])){
					set.add(a[i]);
				}
			}
		}
		//去除和C中相同的
		for(int k=0;k<c.length;k++){
			if(set.contains(c[k])){
				set.remove(c[k]);
			}
		}
		System.out.println(set.size());
	}
}
