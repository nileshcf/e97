package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip66601UserTagInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip66601UserTagInformation extends Ip66601UserTagInformationSerialized {
   

								private short ip66601UserTcnt;
				private Ip66601UserTagTable ip66601UserTagTable = new Ip66601UserTagTable();
	
	/**
	* Constructor for Ip66601UserTagInformation
	**/
    public Ip66601UserTagInformation() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip66601UserTagTable.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip66601UserTcnt
	 *	@return ip66601UserTcnt
	 */
	public short getIp66601UserTcnt() throws CFException {
        if (isIp66601UserTcntModified()) { 
           ip66601UserTcnt = refreshIp66601UserTcnt();
        }
   		return ip66601UserTcnt;
	}
	
	/**
	 * 	Update Ip66601UserTcnt with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TCNT
	 *	@param number
	 */
	public void setIp66601UserTcnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTcnt = checkIp66601UserTcntMaxLimit(number); 
		serializeIp66601UserTcnt(ip66601UserTcnt);
	}

	public void setIp66601UserTcnt(int number) {
	    number = checkIp66601UserTcntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTcnt((short)number);
	}
	public void setIp66601UserTcnt(long number) {
	    number = checkIp66601UserTcntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTcnt((short)number);
	}
	

	/**
	 *	Returns the value of ip66601UserTagTable
	 *	@return ip66601UserTagTable
	 */   
	 public Ip66601UserTagTable getIp66601UserTagTable() {
   	return ip66601UserTagTable;
   }
   /**
	* 	Update Ip66601UserTagTable with the passed value
	*   Corresponding COBOL Variable is IP66601-USER-TAG-TABLE
	*	@param value
	*/
   public void setIp66601UserTagTable(char[] value) {
      ip66601UserTagTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagTable.begin,ip66601UserTagTable.length());
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagTable with another Field
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source) {
   	replace(source,0,source.length(),ip66601UserTagTable.begin,ip66601UserTagTable.length());
   }  
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagTable.begin,ip66601UserTagTable.length());
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp66601UserTagInformationFieldLength() {
			return IP_66601_USER_TAG_INFORMATION_LENGTH;
		}

}
  
