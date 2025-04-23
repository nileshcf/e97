package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtCustAcctNo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtCustAcctNo extends ExtCustAcctNoSerialized { 
   

								private long extCustIdNo;

								private long extAcctNo;
	
	/**
	* Constructor for ExtCustAcctNo
	**/
    public ExtCustAcctNo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtCustAcctNo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtCustAcctNo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setExtCustIdNo(8762L);
								setExtAcctNo(2345L);
    } 

	/**
	 *	Returns the value of extCustIdNo
	 *	@return extCustIdNo
	 */
	public long getExtCustIdNo() throws CFException {
       if (isExtCustIdNoModified()) { 
           extCustIdNo = refreshExtCustIdNo();
        }
   		return extCustIdNo;
	}
	

	
	   
	/**
	 * 	Update ExtCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-CUST-ID-NO
	 *	@param number
	 */
	public void setExtCustIdNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    extCustIdNo = checkExtCustIdNoMaxLimit(number); 
		serializeExtCustIdNo(extCustIdNo);
	}
	

	/**
	 * 	Update ExtCustIdNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtCustIdNo(char[] value) throws CFException {
		 extCustIdNo = serializeExtCustIdNo(value);
	}
	/**
	 * 	Update ExtCustIdNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtCustIdNoString(char[] value) throws CFException {
		 setExtCustIdNo(value);
	}
	/**
	 *	Returns the value of extAcctNo
	 *	@return extAcctNo
	 */
	public long getExtAcctNo() throws CFException {
       if (isExtAcctNoModified()) { 
           extAcctNo = refreshExtAcctNo();
        }
   		return extAcctNo;
	}
	

	
	   
	/**
	 * 	Update ExtAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-ACCT-NO
	 *	@param number
	 */
	public void setExtAcctNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    extAcctNo = checkExtAcctNoMaxLimit(number); 
		serializeExtAcctNo(extAcctNo);
	}
	

	/**
	 * 	Update ExtAcctNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtAcctNo(char[] value) throws CFException {
		 extAcctNo = serializeExtAcctNo(value);
	}
	/**
	 * 	Update ExtAcctNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtAcctNoString(char[] value) throws CFException {
		 setExtAcctNo(value);
	}

	
	
	

		public static int getExtCustAcctNoFieldLength() {
			return EXT_CUST_ACCT_NO_LENGTH;
		}

}
  
