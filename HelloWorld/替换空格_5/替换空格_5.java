package �滻�ո�_5;
//ע��for��д����
//StringBuffer��String��һ����
//�����ַ����ķ�����charAt()
public class �滻�ո�_5 {
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
		// TODO �Զ����ɵķ������
		�滻�ո�_5 a = new �滻�ո�_5();
		StringBuffer str = new StringBuffer("H E L L O");
		System.out.println(a.replaceSpace(str));
	}

}
