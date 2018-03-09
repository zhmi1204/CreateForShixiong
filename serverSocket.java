while(true){
	try{
		//创建绑定到特定端口的服务端套接字
		ServerSocket serverSocket=new ServerSocket(9999)
		Syetem.out.println("***服务器即将启动，请等待客户端链接***");
		//侦听并接收到此套接字的链接
		Socket socket=serverSocket.accept();
		//获取输出流
		InputStream is=socket.getInputStream();
		//将字节输入流转化为字符输入流
		InputStreamReader isr=new InputStreamReader(is);
		BufferReader br=new BufferReader(isr);
		String str=null;
		while((str=br.readLine())!=null){
			System.out.println("服务器说：客户端发送了:" + str);
			br.readLine();
		}
		//此套接字的输入流置入流的末尾
		socket.shutdownInput();
		br.close();
		isr.close();
		is.close();
	}
	catch (IOException e){
		e.printStackTrace();
	}
}