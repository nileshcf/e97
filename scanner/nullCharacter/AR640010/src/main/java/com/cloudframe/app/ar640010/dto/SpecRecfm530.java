package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecRecfm530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SpecRecfm530 extends SpecRecfm530Serialized { 
   

							private char[] specTable530ConditionGroup4 = new char[1];
						

	
	/**
	* Constructor for SpecRecfm530
	**/
    public SpecRecfm530() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SpecRecfm530. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecRecfm530(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 1
             ,2
             );
    } 

	/**
	 *	Returns the value of specTable530ConditionGroup4
	 *	@return specTable530ConditionGroup4
	 */
   public char[] getSpecTable530ConditionGroup4() throws CFException{
     if (isSpecTable530ConditionGroup4Modified()) { 
        specTable530ConditionGroup4 = refreshSpecTable530ConditionGroup4();
     }
   		return specTable530ConditionGroup4;
   }

  
	/**
	*  set variable specTable530ConditionGroup4
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setSpecTable530ConditionGroup4(char[] value) {
      specTable530ConditionGroup4 = checkSpecTable530ConditionGroup4Constraints(value);
      serializeSpecTable530ConditionGroup4(specTable530ConditionGroup4);
   } 

     /**
	 * 	Update SpecTable530ConditionGroup4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecTable530ConditionGroup4,specTable530ConditionGroup4.length);
   	
   }
   
   public void setSpecTable530ConditionGroup4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup4,specTable530ConditionGroup4.length);
   	
   }
   
     /**
	 * 	Update SpecTable530ConditionGroup4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecTable530ConditionGroup4 with another Field
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup4(Field source) {
       replace(source,0,source.length(),beginSpecTable530ConditionGroup4,SPEC_TABLE_530_CONDITION_GROUP_4_LEN);
   	
   }  
   
     /**
	 * 	Update SpecTable530ConditionGroup4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup4,SPEC_TABLE_530_CONDITION_GROUP_4_LEN);
   	
   }
   
     /**
	 * 	Update SpecTable530ConditionGroup4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup4+targetIndex,targetLen);
    
   }
	char[] specRecfmFix8853088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isSpecRecfmFix88530()
	 *	@return  Returns true if isSpecRecfmFix88530() is "F"
	 */
   public boolean isSpecRecfmFix88530() throws CFException {
      return (  compareChars( getSpecTable530ConditionGroup4() , specRecfmFix8853088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setSpecRecfmFix88530True() {  			
    	setSpecTable530ConditionGroup4( specRecfmFix8853088Value);
   	}
	char[] specRecfmVar8853088Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isSpecRecfmVar88530()
	 *	@return  Returns true if isSpecRecfmVar88530() is "V"
	 */
   public boolean isSpecRecfmVar88530() throws CFException {
      return (  compareChars( getSpecTable530ConditionGroup4() , specRecfmVar8853088Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setSpecRecfmVar88530True() {  			
    	setSpecTable530ConditionGroup4( specRecfmVar8853088Value);
   	}
	char[] specRecfmUnd8853088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isSpecRecfmUnd88530()
	 *	@return  Returns true if isSpecRecfmUnd88530() is "U"
	 */
   public boolean isSpecRecfmUnd88530() throws CFException {
      return (  compareChars( getSpecTable530ConditionGroup4() , specRecfmUnd8853088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setSpecRecfmUnd88530True() {  			
    	setSpecTable530ConditionGroup4( specRecfmUnd8853088Value);
   	}

	
	
	

		public static int getSpecRecfm530FieldLength() {
			return SPEC_RECFM_530_LENGTH;
		}

}
  
