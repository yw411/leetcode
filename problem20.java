package leetcode;

import java.util.Stack;

public class project20 {
	public static boolean pipei(String s){
		/*boolean result=true;
		char[] stack=new char[s.length()+1];
		stack[0]='0';
		int top=0;
		//����ƥ�����⣬ջ��֪ʶ
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){ //��ջ
				top++;
				stack[top]=s.charAt(i);
			}
			else if(s.charAt(i)==')'){
				if(stack[top]=='('){
					top--;//��ջ
				}
				else{
					result=false;
					break;
				}
			}
			else if(s.charAt(i)==']'){
				if(stack[top]=='['){
					top--;//��ջ
				}
				else{
					result=false;
					break;
				}
			}
			else if(s.charAt(i)=='}'){
				if(stack[top]=='{'){
					top--;//��ջ
				}
				else{
					result=false;
					break;
				}
			}
			else
				continue;
		}
		if(result && top==0){
			result=true;
		}
		else{
			result=false;
		}
		System.out.println(result);*/
		
		//java����ջ
		boolean result=true;
		Stack a=new Stack();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
				a.push(s.charAt(i));
			}
			else if(s.charAt(i)==')'){
				if (a.empty() || (char)a.peek()!='(' )
					return false;
				else
					a.pop();
			}
			else if(s.charAt(i)==']'){
				if ( a.empty() || (char)a.peek()!='[')
					return false;
				else
					a.pop();
			}
			else if(s.charAt(i)=='}'){
				if ( a.empty() || (char)a.peek()!='{' )
					return false;
				else
					a.pop();
			}
		}
		if(a.empty())
			return true;
		else
			return false;
	}
}
