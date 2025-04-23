package com.cloudframe.app.mcsort05.file.records;

/**
*  The class Ip40005GroupStatusRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort05.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ip40005GroupStatusRec extends Ip40005GroupStatusRecSerialized {
   

								private int ip40005GrpFileSeqNbr;

								private long ip40005GroupSeqNum;
	
	/**
	* Constructor for Ip40005GroupStatusRec
	**/
    public Ip40005GroupStatusRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip40005GrpFileSeqNbr
	 *	@return ip40005GrpFileSeqNbr
	 */
	public int getIp40005GrpFileSeqNbr() throws CFException {
       if (isIp40005GrpFileSeqNbrModified()) { 
           ip40005GrpFileSeqNbr = refreshIp40005GrpFileSeqNbr();
        }
   		return ip40005GrpFileSeqNbr;
	}
	

	
	   
	/**
	 * 	Update Ip40005GrpFileSeqNbr with the passed value
	 *  Corresponding COBOL Variable is IP40005-GRP-FILE-SEQ-NBR
	 *	@param number
	 */
	public void setIp40005GrpFileSeqNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40005GrpFileSeqNbr = checkIp40005GrpFileSeqNbrMaxLimit(number); 
		serializeIp40005GrpFileSeqNbr(ip40005GrpFileSeqNbr);
	}
	

	public void setIp40005GrpFileSeqNbr(long number) {
	    number = checkIp40005GrpFileSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40005GrpFileSeqNbr((int)number);
	}
	
	/**
	 * 	Update Ip40005GrpFileSeqNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40005GrpFileSeqNbr(char[] value) throws CFException {
		 ip40005GrpFileSeqNbr = serializeIp40005GrpFileSeqNbr(value);
	}
	/**
	 * 	Update Ip40005GrpFileSeqNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40005GrpFileSeqNbrString(char[] value) throws CFException {
		 setIp40005GrpFileSeqNbr(value);
	}
	/**
	 *	Returns the value of ip40005GroupSeqNum
	 *	@return ip40005GroupSeqNum
	 */
	public long getIp40005GroupSeqNum() throws CFException {
        if (isIp40005GroupSeqNumModified()) { 
           ip40005GroupSeqNum = refreshIp40005GroupSeqNum();
        }
   		return ip40005GroupSeqNum;
	}
	
	/**
	 * 	Update Ip40005GroupSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP40005-GROUP-SEQ-NUM
	 *	@param number
	 */
	public void setIp40005GroupSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip40005GroupSeqNum = checkIp40005GroupSeqNumMaxLimit(number); 
		serializeIp40005GroupSeqNum(ip40005GroupSeqNum);
	}



	
	
	

		public static int getIp40005GroupStatusRecFieldLength() {
			return IP_40005_GROUP_STATUS_REC_LENGTH;
		}

}
  
