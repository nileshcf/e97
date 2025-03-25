package org.optum.uhg.dto.cics0009;

/**
*  The class LsDfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cics0009.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsDfhcommarea extends LsDfhcommareaSerialized { 
   

								private int lsRequestType;
				private LsRequestDataGroup lsRequestDataGroup = new LsRequestDataGroup();

								private int lsReturnCode;

								private long lsReturnEibresp;

								private long lsReturnEibresp2;
	
	/**
	* Constructor for LsDfhcommarea
	**/
    public LsDfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			lsRequestDataGroup.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsRequestType
	 *	@return lsRequestType
	 */
	public int getLsRequestType() throws CFException {
        if (isLsRequestTypeModified()) { 
           lsRequestType = refreshLsRequestType();
        }
   		return lsRequestType;
	}
	
	/**
	 * 	Update LsRequestType with the passed value
	 *  Corresponding COBOL Variable is LS-REQUEST-TYPE
	 *	@param number
	 */
	public void setLsRequestType(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsRequestType = checkLsRequestTypeMaxLimit(number); 
		serializeLsRequestType(lsRequestType);
	}


	public void setLsRequestType(long number) {
	    number = checkLsRequestTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsRequestType((int)number);
	}
	
	/**
	 *	Returns the value of lsRequestDataGroup
	 *	@return lsRequestDataGroup
	 */   
	 public LsRequestDataGroup getLsRequestDataGroup() {
   	return lsRequestDataGroup;
   }
   /**
	* 	Update LsRequestDataGroup with the passed value
	*   Corresponding COBOL Variable is LS-REQUEST-DATA-GROUP
	*	@param value
	*/
   public void setLsRequestDataGroup(char[] value) {
      lsRequestDataGroup.setString(value); 
   }   
    
     /**
	 * 	Update LsRequestDataGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLsRequestDataGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lsRequestDataGroup.begin,lsRequestDataGroup.length());
   }
   
     /**
	 * 	Update LsRequestDataGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestDataGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lsRequestDataGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LsRequestDataGroup with another Field
	 *	@param value
	 */
   public void setLsRequestDataGroup(Field source) {
   	replace(source,0,source.length(),lsRequestDataGroup.begin,lsRequestDataGroup.length());
   }  
   
     /**
	 * 	Update LsRequestDataGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLsRequestDataGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lsRequestDataGroup.begin,lsRequestDataGroup.length());
   }
   
     /**
	 * 	Update LsRequestDataGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestDataGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lsRequestDataGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
       if (isLsReturnCodeModified()) { 
           lsReturnCode = refreshLsReturnCode();
        }
   		return lsReturnCode;
	}
	

	
	   
	/**
	 * 	Update LsReturnCode with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-CODE
	 *	@param number
	 */
	public void setLsReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnCode = checkLsReturnCodeMaxLimit(number); 
		serializeLsReturnCode(lsReturnCode);
	}
	

	public void setLsReturnCode(long number) {
	    number = checkLsReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsReturnCode((int)number);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value) throws CFException {
		 lsReturnCode = serializeLsReturnCode(value);
	}
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value) throws CFException {
		 setLsReturnCode(value);
	}
	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
       if (isLsReturnEibrespModified()) { 
           lsReturnEibresp = refreshLsReturnEibresp();
        }
   		return lsReturnEibresp;
	}
	

	
	   
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-EIBRESP
	 *	@param number
	 */
	public void setLsReturnEibresp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnEibresp = checkLsReturnEibrespMaxLimit(number); 
		serializeLsReturnEibresp(lsReturnEibresp);
	}
	

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value) throws CFException {
		 lsReturnEibresp = serializeLsReturnEibresp(value);
	}
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value) throws CFException {
		 setLsReturnEibresp(value);
	}
	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
       if (isLsReturnEibresp2Modified()) { 
           lsReturnEibresp2 = refreshLsReturnEibresp2();
        }
   		return lsReturnEibresp2;
	}
	

	
	   
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-EIBRESP2
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnEibresp2 = checkLsReturnEibresp2MaxLimit(number); 
		serializeLsReturnEibresp2(lsReturnEibresp2);
	}
	

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value) throws CFException {
		 lsReturnEibresp2 = serializeLsReturnEibresp2(value);
	}
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value) throws CFException {
		 setLsReturnEibresp2(value);
	}

	
	
	

		public static int getLsDfhcommareaFieldLength() {
			return LS_DFHCOMMAREA_LENGTH;
		}

}
  
