package com.cloudframe.app.init1.dto;

/**
*  The class FlguuInEocUsgBlDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlguuInEocUsgBlDtl extends FlguuInEocUsgBlDtlSerialized { 
   

						private char[] flguuSpclAppType = Field.fillLowValue(5);
	
	/**
	* Constructor for FlguuInEocUsgBlDtl
	**/
    public FlguuInEocUsgBlDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlguuInEocUsgBlDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flguuSpclAppType
	 *	@return flguuSpclAppType
	 */
   public char[] getFlguuSpclAppType() throws CFException{
     if (isFlguuSpclAppTypeModified()) { 
        flguuSpclAppType = refreshFlguuSpclAppType();
     }
   		return flguuSpclAppType;
   }

  
	/**
	*  set variable flguuSpclAppType
	*  Corresponding COBOL Variable is FLGUU-SPCL-APP-TYPE
	*  @param value
	**/
   public void setFlguuSpclAppType(char[] value) {
      flguuSpclAppType = checkFlguuSpclAppTypeConstraints(value);
      serializeFlguuSpclAppType(flguuSpclAppType);
   } 

     /**
	 * 	Update FlguuSpclAppType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlguuSpclAppType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlguuSpclAppType,flguuSpclAppType.length);
   	
   }
   
   public void setFlguuSpclAppType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuSpclAppType,flguuSpclAppType.length);
   	
   }
   
     /**
	 * 	Update FlguuSpclAppType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlguuSpclAppType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuSpclAppType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlguuSpclAppType with another Field
	 *	@param value
	 */
   public void setFlguuSpclAppType(Field source) {
       replace(source,0,source.length(),beginFlguuSpclAppType,FLGUU_SPCL_APP_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update FlguuSpclAppType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlguuSpclAppType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlguuSpclAppType,FLGUU_SPCL_APP_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update FlguuSpclAppType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlguuSpclAppType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuSpclAppType+targetIndex,targetLen);
    
   }
	char[] flguuAppPlab88Value1 = "PLABC".toCharArray();
char[] flguuAppPlab88Value2 = "PLABU".toCharArray();

	/**
	 *	Test condition "PLABC" "PLABU" for isFlguuAppPlab()
	 *	@return  Returns true if isFlguuAppPlab() is "PLABC" "PLABU"
	 */
   public boolean isFlguuAppPlab() throws CFException {
      return (  compareChars( getFlguuSpclAppType() , flguuAppPlab88Value1)  == 0  ||  compareChars( getFlguuSpclAppType() , flguuAppPlab88Value2)  == 0  );
   }


	/**
	*  set values "PLABC" "PLABU"
	*/
   	public void setFlguuAppPlabTrue() {  			
    	setFlguuSpclAppType( flguuAppPlab88Value1);
   	}

	
	
	

		public static int getFlguuInEocUsgBlDtlFieldLength() {
			return FLGUU_IN_EOC_USG_BL_DTL_LENGTH;
		}

}
  
