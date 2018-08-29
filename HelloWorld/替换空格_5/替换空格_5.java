package 替换空格_5;
//注意for的写法；
//StringBuffer和String不一样的
//索引字符串的方法是charAt()
public class 替换空格_5 {
    public String replaceSpace(StringBuffer str) {
    	if (str == null){
            return null;
        }
        StringBuffer ans = new StringBuffer();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == ' '){
                ans.append('%');
                ans.append('2');
                ans.append('0');
            }
            else{
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		替换空格_5 a = new 替换空格_5();
		StringBuffer str = new StringBuffer("H E L L O");
		System.out.println(a.replaceSpace(str));
	}

}
