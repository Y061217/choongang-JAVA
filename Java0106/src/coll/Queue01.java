package coll;

import java.util.LinkedList;
import java.util.Queue;

class Msg{
	public String cment;
	public String to;
	public Msg(String cment, String to) {
		this.cment = cment;
		this.to = to;
	}
}
public class Queue01 {

	public static void main(String[] args) {
		Queue<Msg> m1 = new LinkedList<Msg>();
		m1.offer(new Msg("sendMail","마야"));
		m1.offer(new Msg("sendSMS","장로스탄"));
		m1.offer(new Msg("sendMail","돼지와 함께 춤을"));
		
		while (!m1.isEmpty()) {
			Msg msg = m1.poll();
			switch (msg.cment) {
			case "sendMail":
				System.out.println(msg.to + "님에게 메세지를 보냅니다.");
				break;
			
			case "sendSMS":
				System.out.println(msg.to + "님에게 문자를 보냅니다.");
			default:
				break;
			}
		}

	}

}
