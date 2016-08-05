package spring.model.msg;

public class MsgDTO {
	int 	msgNum    	;  
	String	msgTitle	;  
    String	msgContent	;  
    String	sendID    	;  
    String	sendDate  	;  
    String	sendDelete	; 		// TF  
    String	recvID    	;  
    String	recvDate  	;  
    String	recvDelete	; 		// TF  
    String	recvRead	; 		// TF 
    
    
	public int getMsgNum() {
		return msgNum;
	}
	public void setMsgNum(int msgNum) {
		this.msgNum = msgNum;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getSendID() {
		return sendID;
	}
	public void setSendID(String sendID) {
		this.sendID = sendID;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	public String getSendDelete() {
		return sendDelete;
	}
	public void setSendDelete(String sendDelete) {
		this.sendDelete = sendDelete;
	}
	public String getRecvID() {
		return recvID;
	}
	public void setRecvID(String recvID) {
		this.recvID = recvID;
	}
	public String getRecvDate() {
		return recvDate;
	}
	public void setRecvDate(String recvDate) {
		this.recvDate = recvDate;
	}
	public String getRecvDelete() {
		return recvDelete;
	}
	public void setRecvDelete(String recvDelete) {
		this.recvDelete = recvDelete;
	}
	public String getRecvRead() {
		return recvRead;
	}
	public void setRecvRead(String recvRead) {
		this.recvRead = recvRead;
	}
    
    
}
