package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnHlqid820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GftdsnHlqid820 extends GftdsnHlqid820Serialized { 
   


							private char[] gftdsnWorkAreas820ConditionGroup2 = new char[1];
						
	
	/**
	* Constructor for GftdsnHlqid820
	**/
    public GftdsnHlqid820() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GftdsnHlqid820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnHlqid820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 3
             ,1
             );
    } 

	/**
	 *	Returns the value of gftdsnWorkAreas820ConditionGroup2
	 *	@return gftdsnWorkAreas820ConditionGroup2
	 */
   public char[] getGftdsnWorkAreas820ConditionGroup2() throws CFException{
     if (isGftdsnWorkAreas820ConditionGroup2Modified()) { 
        gftdsnWorkAreas820ConditionGroup2 = refreshGftdsnWorkAreas820ConditionGroup2();
     }
   		return gftdsnWorkAreas820ConditionGroup2;
   }

  
	/**
	*  set variable gftdsnWorkAreas820ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setGftdsnWorkAreas820ConditionGroup2(char[] value) {
      gftdsnWorkAreas820ConditionGroup2 = checkGftdsnWorkAreas820ConditionGroup2Constraints(value);
      serializeGftdsnWorkAreas820ConditionGroup2(gftdsnWorkAreas820ConditionGroup2);
   } 

     /**
	 * 	Update GftdsnWorkAreas820ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnWorkAreas820ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnWorkAreas820ConditionGroup2,gftdsnWorkAreas820ConditionGroup2.length);
   	
   }
   
   public void setGftdsnWorkAreas820ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnWorkAreas820ConditionGroup2,gftdsnWorkAreas820ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update GftdsnWorkAreas820ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnWorkAreas820ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnWorkAreas820ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnWorkAreas820ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setGftdsnWorkAreas820ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginGftdsnWorkAreas820ConditionGroup2,GFTDSN_WORK_AREAS_820_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnWorkAreas820ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnWorkAreas820ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnWorkAreas820ConditionGroup2,GFTDSN_WORK_AREAS_820_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnWorkAreas820ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnWorkAreas820ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnWorkAreas820ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] gftdsnHlqidLen38882088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isGftdsnHlqidLen388820()
	 *	@return  Returns true if isGftdsnHlqidLen388820() is " "
	 */
   public boolean isGftdsnHlqidLen388820() throws CFException {
      return (  compareChars( getGftdsnWorkAreas820ConditionGroup2() , gftdsnHlqidLen38882088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setGftdsnHlqidLen388820True() {  			
    	setGftdsnWorkAreas820ConditionGroup2( gftdsnHlqidLen38882088Value);
   	}

	
	
	

		public static int getGftdsnHlqid820FieldLength() {
			return GFTDSN_HLQID_820_LENGTH;
		}

}
  
