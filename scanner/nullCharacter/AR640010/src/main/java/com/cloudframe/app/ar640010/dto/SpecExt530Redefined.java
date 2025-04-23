package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecExt530Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SpecExt530Redefined extends SpecExt530RedefinedSerialized { 
   

							private char[] specTable530ConditionGroup2 = new char[1];
						

	
	/**
	* Constructor for SpecExt530Redefined
	**/
    public SpecExt530Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SpecExt530Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecExt530Redefined(Field parent,int begin) {
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
             fillSpace(7)
             , getStartOffset() + 1
             ,7
             );
    } 

	/**
	 *	Returns the value of specTable530ConditionGroup2
	 *	@return specTable530ConditionGroup2
	 */
   public char[] getSpecTable530ConditionGroup2() throws CFException{
     if (isSpecTable530ConditionGroup2Modified()) { 
        specTable530ConditionGroup2 = refreshSpecTable530ConditionGroup2();
     }
   		return specTable530ConditionGroup2;
   }

  
	/**
	*  set variable specTable530ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setSpecTable530ConditionGroup2(char[] value) {
      specTable530ConditionGroup2 = checkSpecTable530ConditionGroup2Constraints(value);
      serializeSpecTable530ConditionGroup2(specTable530ConditionGroup2);
   } 

     /**
	 * 	Update SpecTable530ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecTable530ConditionGroup2,specTable530ConditionGroup2.length);
   	
   }
   
   public void setSpecTable530ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup2,specTable530ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update SpecTable530ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecTable530ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginSpecTable530ConditionGroup2,SPEC_TABLE_530_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update SpecTable530ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup2,SPEC_TABLE_530_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update SpecTable530ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecTable530ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecTable530ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] specExtNone8853088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isSpecExtNone88530()
	 *	@return  Returns true if isSpecExtNone88530() is " "
	 */
   public boolean isSpecExtNone88530() throws CFException {
      return (  compareChars( getSpecTable530ConditionGroup2() , specExtNone8853088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setSpecExtNone88530True() {  			
    	setSpecTable530ConditionGroup2( specExtNone8853088Value);
   	}
	
	/**
	 *	Test condition "+" "-" "0" THRU "9" for isSpecExtGdg88530()
	 *	@return  Returns true if isSpecExtGdg88530() is "+" "-" "0" THRU "9"
	 */
   public boolean isSpecExtGdg88530() throws CFException {
      return (  isGreaterOrEqual(getSpecTable530ConditionGroup2(), "0" ) &&  isLessOrEqual(getSpecTable530ConditionGroup2(),"9" )  ||  compareChars( getSpecTable530ConditionGroup2() , "+".toCharArray())  == 0  ||  compareChars( getSpecTable530ConditionGroup2() , "-".toCharArray())  == 0  );
   }


	/**
	*  set values "+" "-" "0" THRU "9"
	*/
   	public void setSpecExtGdg88530True() {  			
    	setSpecTable530ConditionGroup2( "0".toCharArray());
   	}
	char[] specExtNew8853088Value = "+".toCharArray();
	/**
	 *	Test condition "+" for isSpecExtNew88530()
	 *	@return  Returns true if isSpecExtNew88530() is "+"
	 */
   public boolean isSpecExtNew88530() throws CFException {
      return (  compareChars( getSpecTable530ConditionGroup2() , specExtNew8853088Value)  == 0  );
   }


	/**
	*  set values "+"
	*/
   	public void setSpecExtNew88530True() {  			
    	setSpecTable530ConditionGroup2( specExtNew8853088Value);
   	}
	
	/**
	 *	Test condition "A" THRU "I" "J" THRU "R" "S" THRU "Z" "@" "#" "$" for isSpecExtPds88530()
	 *	@return  Returns true if isSpecExtPds88530() is "A" THRU "I" "J" THRU "R" "S" THRU "Z" "@" "#" "$"
	 */
   public boolean isSpecExtPds88530() throws CFException {
      return (  isGreaterOrEqual(getSpecTable530ConditionGroup2(), "A" ) &&  isLessOrEqual(getSpecTable530ConditionGroup2(),"I" )  ||  isGreaterOrEqual(getSpecTable530ConditionGroup2(), "J" ) &&  isLessOrEqual(getSpecTable530ConditionGroup2(),"R" )  ||  isGreaterOrEqual(getSpecTable530ConditionGroup2(), "S" ) &&  isLessOrEqual(getSpecTable530ConditionGroup2(),"Z" )  ||  compareChars( getSpecTable530ConditionGroup2() , "@".toCharArray())  == 0  ||  compareChars( getSpecTable530ConditionGroup2() , "#".toCharArray())  == 0  ||  compareChars( getSpecTable530ConditionGroup2() , "$".toCharArray())  == 0  );
   }


	/**
	*  set values "A" THRU "I" "J" THRU "R" "S" THRU "Z" "@" "#" "$"
	*/
   	public void setSpecExtPds88530True() {  			
    	setSpecTable530ConditionGroup2( "A".toCharArray());
   	}

	
	
	

		public static int getSpecExt530RedefinedFieldLength() {
			return SPEC_EXT_530_REDEFINED_LENGTH;
		}

}
  
