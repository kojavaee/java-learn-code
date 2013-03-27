package urlAndUri;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: 查看指定主机上前1024个端口那些可以提供TCP服务
 * @Author     : lzh laizhihuan@basecity.com
 * @Date       : 2013-3-27 下午2:42:47
 *
 */
public class LowPortScanner {
	public static void main(String[] args) {
		String host = "127.0.0.1";
		for(int i=1; i<1024; i++) {
			try {
				Socket s = new Socket(host,i);
				System.out.println("There is a server on port " + i + " of " + host);
			} catch (UnknownHostException e) {
				System.err.println(e);
			} catch (IOException e) {
			}
		}
	}
}
