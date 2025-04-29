package com.cloudframe.app.global.sharedvar;

/**
*  The class IsSoftSyntaxAppliedGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_isSoftSyntaxAppliedGroup100")

public class IsSoftSyntaxAppliedGroup100 extends IsSoftSyntaxAppliedGroup100Serialized  implements InitializingBean {
   

						private char[] isSoftSyntaxApplied100 = Field.fillLowValue(1);
	
	/**
	* Constructor for IsSoftSyntaxAppliedGroup100
	**/
    public IsSoftSyntaxAppliedGroup100() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of isSoftSyntaxApplied100
	 *	@return isSoftSyntaxApplied100
	 */
   public char[] getIsSoftSyntaxApplied100() throws CFException{
     if (isIsSoftSyntaxApplied100Modified()) { 
        isSoftSyntaxApplied100 = refreshIsSoftSyntaxApplied100();
     }
   		return isSoftSyntaxApplied100;
   }

  
	/**
	*  set variable isSoftSyntaxApplied100
	*  Corresponding COBOL Variable is 100-IS-SOFT-SYNTAX-APPLIED
	*  @param value
	**/
   public void setIsSoftSyntaxApplied100(char[] value) {
      isSoftSyntaxApplied100 = checkIsSoftSyntaxApplied100Constraints(value);
      serializeIsSoftSyntaxApplied100(isSoftSyntaxApplied100);
   } 

     /**
	 * 	Update IsSoftSyntaxApplied100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsSoftSyntaxApplied100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsSoftSyntaxApplied100,isSoftSyntaxApplied100.length);
   	
   }
   
   public void setIsSoftSyntaxApplied100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsSoftSyntaxApplied100,isSoftSyntaxApplied100.length);
   	
   }
   
     /**
	 * 	Update IsSoftSyntaxApplied100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsSoftSyntaxApplied100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsSoftSyntaxApplied100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsSoftSyntaxApplied100 with another Field
	 *	@param value
	 */
   public void setIsSoftSyntaxApplied100(Field source) {
       replace(source,0,source.length(),beginIsSoftSyntaxApplied100,IS_SOFT_SYNTAX_APPLIED_100_LEN);
   	
   }  
   
     /**
	 * 	Update IsSoftSyntaxApplied100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsSoftSyntaxApplied100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsSoftSyntaxApplied100,IS_SOFT_SYNTAX_APPLIED_100_LEN);
   	
   }
   
     /**
	 * 	Update IsSoftSyntaxApplied100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsSoftSyntaxApplied100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsSoftSyntaxApplied100+targetIndex,targetLen);
    
   }
	char[] softSyntaxAppliedY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSoftSyntaxAppliedY88100()
	 *	@return  Returns true if isSoftSyntaxAppliedY88100() is "Y"
	 */
   public boolean isSoftSyntaxAppliedY88100() throws CFException {
      return (  compareChars( getIsSoftSyntaxApplied100() , softSyntaxAppliedY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSoftSyntaxAppliedY88100True() {  			
    	setIsSoftSyntaxApplied100( softSyntaxAppliedY8810088Value);
   	}
	char[] softSyntaxAppliedN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSoftSyntaxAppliedN88100()
	 *	@return  Returns true if isSoftSyntaxAppliedN88100() is "N"
	 */
   public boolean isSoftSyntaxAppliedN88100() throws CFException {
      return (  compareChars( getIsSoftSyntaxApplied100() , softSyntaxAppliedN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSoftSyntaxAppliedN88100True() {  			
    	setIsSoftSyntaxApplied100( softSyntaxAppliedN8810088Value);
   	}

	
	
	

		public static int getIsSoftSyntaxAppliedGroup100FieldLength() {
			return IS_SOFT_SYNTAX_APPLIED_GROUP_100_LENGTH;
		}

}
  
