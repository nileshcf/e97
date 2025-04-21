package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404GrpCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00404GrpCode extends Ip00404GrpCodeSerialized { 
   
      private List<char[]> ip00404GrpCodeDtl; 

	
	/**
	* Constructor for Ip00404GrpCode
	**/
    public Ip00404GrpCode() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404GrpCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404GrpCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip00404GrpCodeDtl
	 *  Corresponding COBOL Variable is IP00404-GRP-CODE-DTL
	 *	@return ip00404GrpCodeDtl
	 */
	public List<char[]> getIp00404GrpCodeDtl() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_00404_GRP_CODE_DTL_SIZE;index++) {
        	list.add( getIp00404GrpCodeDtl( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip00404GrpCodeDtl
	 */
	public char[] getIp00404GrpCodeDtl(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp00404GrpCodeDtl(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_00404_GRP_CODE_DTL_SIZE) {
             	index = IP_00404_GRP_CODE_DTL_SIZE -1; // can't exceed max array size
             	logger.trace("ip00404GrpCodeDtl - Array index exceeded max Size {}, resetting it to max allowed",IP_00404_GRP_CODE_DTL_SIZE); 
	    }
   	      return getCharArray( (beginIp00404GrpCodeDtl + index*IP_00404_GRP_CODE_DTL_LEN) , IP_00404_GRP_CODE_DTL_LEN );
    }
    
    
   public int  ip00404GrpCodeDtlFieldLength() {
   	return IP_00404_GRP_CODE_DTL_LEN;
   }
   
	

  
  	/**
	 *	Update Ip00404GrpCodeDtl with the passed value at a given index
	 *  Corresponding COBOL Variable is IP00404-GRP-CODE-DTL
	 *  @param index
	 *	@param value
	 */
  public void setIp00404GrpCodeDtl(int index,char[] value) {
   	setIp00404GrpCodeDtl(index,value,true);
   }
   
   
   /**
	 *	Update Ip00404GrpCodeDtl with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp00404GrpCodeDtl(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp00404GrpCodeDtl(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp00404GrpCodeDtl(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip00404GrpCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_00404_GRP_CODE_DTL_SIZE;index++) {
             setIp00404GrpCodeDtl(index, CONSTANTS.SPACE_2);
         }
   }

		public static int getIp00404GrpCodeFieldLength() {
			return IP_00404_GRP_CODE_LENGTH;
		}

}
  
