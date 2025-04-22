package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000804PdsAttributes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip000804PdsAttributes")

public class Ip000804PdsAttributes extends Ip000804PdsAttributesSerialized  implements InitializingBean {
   

								private short ip000804MaxPdsNo;
				private Ip000804PdsAttrTable ip000804PdsAttrTable = new Ip000804PdsAttrTable();
	
	/**
	* Constructor for Ip000804PdsAttributes
	**/
    public Ip000804PdsAttributes() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip000804PdsAttrTable.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip000804MaxPdsNo
	 *	@return ip000804MaxPdsNo
	 */
	public short getIp000804MaxPdsNo() throws CFException {
        if (isIp000804MaxPdsNoModified()) { 
           ip000804MaxPdsNo = refreshIp000804MaxPdsNo();
        }
   		return ip000804MaxPdsNo;
	}
	
	/**
	 * 	Update Ip000804MaxPdsNo with the passed value
	 *  Corresponding COBOL Variable is IP000804-MAX-PDS-NO
	 *	@param number
	 */
	public void setIp000804MaxPdsNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000804MaxPdsNo = checkIp000804MaxPdsNoMaxLimit(number); 
		serializeIp000804MaxPdsNo(ip000804MaxPdsNo);
	}

	public void setIp000804MaxPdsNo(int number) {
	    number = checkIp000804MaxPdsNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804MaxPdsNo((short)number);
	}
	public void setIp000804MaxPdsNo(long number) {
	    number = checkIp000804MaxPdsNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000804MaxPdsNo((short)number);
	}
	

	/**
	 *	Returns the value of ip000804PdsAttrTable
	 *	@return ip000804PdsAttrTable
	 */   
	 public Ip000804PdsAttrTable getIp000804PdsAttrTable() {
   	return ip000804PdsAttrTable;
   }
   /**
	* 	Update Ip000804PdsAttrTable with the passed value
	*   Corresponding COBOL Variable is IP000804-PDS-ATTR-TABLE
	*	@param value
	*/
   public void setIp000804PdsAttrTable(char[] value) {
      ip000804PdsAttrTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip000804PdsAttrTable.begin,ip000804PdsAttrTable.length());
   }
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip000804PdsAttrTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip000804PdsAttrTable with another Field
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source) {
   	replace(source,0,source.length(),ip000804PdsAttrTable.begin,ip000804PdsAttrTable.length());
   }  
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip000804PdsAttrTable.begin,ip000804PdsAttrTable.length());
   }
   
     /**
	 * 	Update Ip000804PdsAttrTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsAttrTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip000804PdsAttrTable.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip000804PdsAttributes
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp000804MaxPdsNo((short)0);
          ip000804PdsAttrTable.initialize();
     
   }

		public static int getIp000804PdsAttributesFieldLength() {
			return IP_000804_PDS_ATTRIBUTES_LENGTH;
		}

}
  
