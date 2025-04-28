package com.cloudframe.app.init1.dto;

/**
*  The class RlduuInEocUsgBlDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlduuInEocUsgBlDtl extends RlduuInEocUsgBlDtlSerialized { 
   

						private char[] rlduuSpclAppType = Field.fillLowValue(5);
	
	/**
	* Constructor for RlduuInEocUsgBlDtl
	**/
    public RlduuInEocUsgBlDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlduuInEocUsgBlDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlduuSpclAppType
	 *	@return rlduuSpclAppType
	 */
   public char[] getRlduuSpclAppType() throws CFException{
     if (isRlduuSpclAppTypeModified()) { 
        rlduuSpclAppType = refreshRlduuSpclAppType();
     }
   		return rlduuSpclAppType;
   }

  
	/**
	*  set variable rlduuSpclAppType
	*  Corresponding COBOL Variable is RLDUU-SPCL-APP-TYPE
	*  @param value
	**/
   public void setRlduuSpclAppType(char[] value) {
      rlduuSpclAppType = checkRlduuSpclAppTypeConstraints(value);
      serializeRlduuSpclAppType(rlduuSpclAppType);
   } 

     /**
	 * 	Update RlduuSpclAppType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlduuSpclAppType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlduuSpclAppType,rlduuSpclAppType.length);
   	
   }
   
   public void setRlduuSpclAppType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuSpclAppType,rlduuSpclAppType.length);
   	
   }
   
     /**
	 * 	Update RlduuSpclAppType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlduuSpclAppType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuSpclAppType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlduuSpclAppType with another Field
	 *	@param value
	 */
   public void setRlduuSpclAppType(Field source) {
       replace(source,0,source.length(),beginRlduuSpclAppType,RLDUU_SPCL_APP_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RlduuSpclAppType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlduuSpclAppType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlduuSpclAppType,RLDUU_SPCL_APP_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RlduuSpclAppType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlduuSpclAppType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuSpclAppType+targetIndex,targetLen);
    
   }
	char[] rlduuAppPlab88Value1 = "PLABC".toCharArray();
char[] rlduuAppPlab88Value2 = "PLABU".toCharArray();

	/**
	 *	Test condition "PLABC" "PLABU" for isRlduuAppPlab()
	 *	@return  Returns true if isRlduuAppPlab() is "PLABC" "PLABU"
	 */
   public boolean isRlduuAppPlab() throws CFException {
      return (  compareChars( getRlduuSpclAppType() , rlduuAppPlab88Value1)  == 0  ||  compareChars( getRlduuSpclAppType() , rlduuAppPlab88Value2)  == 0  );
   }


	/**
	*  set values "PLABC" "PLABU"
	*/
   	public void setRlduuAppPlabTrue() {  			
    	setRlduuSpclAppType( rlduuAppPlab88Value1);
   	}

	
	
	

		public static int getRlduuInEocUsgBlDtlFieldLength() {
			return RLDUU_IN_EOC_USG_BL_DTL_LENGTH;
		}

}
  
