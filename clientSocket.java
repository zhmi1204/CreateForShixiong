package socket
public class serverSocket{
	public static void main(String[] args){
		while(true){
			try{
				Socket socket=new Socket("127.0.0.1",9999);
				OutputStream os=socket.getOutputStream();
				PrintWriter print=new PrintWriter(os);
				print.write("你好啊！服务器");
				print.close();
				os.close();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}