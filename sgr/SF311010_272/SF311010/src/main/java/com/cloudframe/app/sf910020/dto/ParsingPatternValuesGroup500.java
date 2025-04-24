package com.cloudframe.app.sf910020.dto;

/**
*  The class ParsingPatternValuesGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf910020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ParsingPatternValuesGroup500 extends ParsingPatternValuesGroup500Serialized { 
   

						private char[] parsingPatternValues500 = new char[2048];
					private ParsingPatternValues500Redefined parsingPatternValues500Redefined = new ParsingPatternValues500Redefined();
	
	/**
	* Constructor for ParsingPatternValuesGroup500
	**/
    public ParsingPatternValuesGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			parsingPatternValues500Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setParsingPatternValues500("               X      X       XX     X       X X     XX      XXX    X       X  X    X X     X XX    XX      XX X    XXX     XXXX   X       X   X   X  X    X  XX   X X     X X X   X XX    X XXX   XX      XX  X   XX X    XX XX   XXX     XXX X   XXXX    XXXXX  X       X    X  X   X   X   XX  X  X    X  X X  X  XX   X  XXX  X X     X X  X  X X X   X X XX  X XX    X XX X  X XXX   X XXXX  XX      XX   X  XX  X   XX  XX  XX X    XX X X  XX XX   XX XXX  XXX     XXX  X  XXX X   XXX XX  XXXX    XXXX X  XXXXX   XXXXXX X       X     X X    X  X    XX X   X   X   X X X   XX  X   XXX X  X    X  X  X X  X X  X  X XX X  XX   X  XX X X  XXX  X  XXXX X X     X X   X X X  X  X X  XX X X X   X X X X X X XX  X X XXX X XX    X XX  X X XX X  X XX XX X XXX   X XXX X X XXXX  X XXXXX XX      XX    X XX   X  XX   XX XX  X   XX  X X XX  XX  XX  XXX XX X    XX X  X XX X X  XX X XX XX XX   XX XX X XX XXX  XX XXXX XXX     XXX   X XXX  X  XXX  XX XXX X   XXX X X XXX XX  XXX XXX XXXX    XXXX  X XXXX X  XXXX XX XXXXX   XXXXX X XXXXXX  XXXXXXXX       X      XX     X X     XXX    X  X    X XX    XX X    XXXX   X   X   X  XX   X X X   X XXX   XX  X   XX XX   XXX X   XXXXX  X    X  X   XX  X  X X  X  XXX  X X  X  X X XX  X XX X  X XXXX  XX   X  XX  XX  XX X X  XX XXX  XXX  X  XXX XX  XXXX X  XXXXXX X     X X    XX X   X X X   XXX X  X  X X  X XX X  XX X X  XXXX X X   X X X  XX X X X X X X XXX X XX  X X XX XX X XXX X X XXXXX XX    X XX   XX XX  X X XX  XXX XX X  X XX X XX XX XX X XX XXXX XXX   X XXX  XX XXX X X XXX XXX XXXX  X XXXX XX XXXXX X XXXXXXXX      XX     XXX    X XX    XXXX   X  XX   X XXX   XX XX   XXXXX  X   XX  X  XXX  X X XX  X XXXX  XX  XX  XX XXX  XXX XX  XXXXXX X    XX X   XXX X  X XX X  XXXX X X  XX X X XXX X XX XX X XXXXX XX   XX XX  XXX XX X XX XX XXXX XXX  XX XXX XXX XXXX XX XXXXXXXX     XXX    XXXX   X XXX   XXXXX  X  XXX  X XXXX  XX XXX  XXXXXX X   XXX X  XXXX X X XXX X XXXXX XX  XXX XX XXXX XXX XXX XXXXXXXX    XXXX   XXXXX  X XXXX  XXXXXX X  XXXX X XXXXX XX XXXX XXXXXXXX   XXXXX  XXXXXX X XXXXX XXXXXXXX  XXXXXX XXXXXXXX XXXXXXXX".toCharArray());
    }


 

	/**
	 *	Returns the value of parsingPatternValues500
	 *	@return parsingPatternValues500
	 */
   public char[] getParsingPatternValues500() throws CFException{
     if (isParsingPatternValues500Modified()) { 
        parsingPatternValues500 = refreshParsingPatternValues500();
     }
   		return parsingPatternValues500;
   }

  
	/**
	*  set variable parsingPatternValues500
	*  Corresponding COBOL Variable is 500-PARSING-PATTERN-VALUES
	*  @param value
	**/
   public void setParsingPatternValues500(char[] value) {
      parsingPatternValues500 = checkParsingPatternValues500Constraints(value);
      serializeParsingPatternValues500(parsingPatternValues500);
   } 

     /**
	 * 	Update ParsingPatternValues500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParsingPatternValues500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParsingPatternValues500,parsingPatternValues500.length);
   	
   }
   
   public void setParsingPatternValues500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParsingPatternValues500,parsingPatternValues500.length);
   	
   }
   
     /**
	 * 	Update ParsingPatternValues500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParsingPatternValues500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParsingPatternValues500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParsingPatternValues500 with another Field
	 *	@param value
	 */
   public void setParsingPatternValues500(Field source) {
       replace(source,0,source.length(),beginParsingPatternValues500,PARSING_PATTERN_VALUES_500_LEN);
   	
   }  
   
     /**
	 * 	Update ParsingPatternValues500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParsingPatternValues500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParsingPatternValues500,PARSING_PATTERN_VALUES_500_LEN);
   	
   }
   
     /**
	 * 	Update ParsingPatternValues500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParsingPatternValues500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParsingPatternValues500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parsingPatternValues500Redefined
	 *	@return parsingPatternValues500Redefined
	 */   
	 public ParsingPatternValues500Redefined getParsingPatternValues500Redefined() {
   	return parsingPatternValues500Redefined;
   }
   /**
	* 	Update ParsingPatternValues500Redefined with the passed value
	*   Corresponding COBOL Variable is 500-PARSING-PATTERN-VALUES-REDEFINED
	*	@param value
	*/
   public void setParsingPatternValues500Redefined(char[] value) {
      parsingPatternValues500Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ParsingPatternValues500Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParsingPatternValues500Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parsingPatternValues500Redefined.begin,parsingPatternValues500Redefined.length());
   }
   
     /**
	 * 	Update ParsingPatternValues500Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParsingPatternValues500Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parsingPatternValues500Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ParsingPatternValues500Redefined with another Field
	 *	@param value
	 */
   public void setParsingPatternValues500Redefined(Field source) {
   	replace(source,0,source.length(),parsingPatternValues500Redefined.begin,parsingPatternValues500Redefined.length());
   }  
   
     /**
	 * 	Update ParsingPatternValues500Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParsingPatternValues500Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parsingPatternValues500Redefined.begin,parsingPatternValues500Redefined.length());
   }
   
     /**
	 * 	Update ParsingPatternValues500Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParsingPatternValues500Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parsingPatternValues500Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getParsingPatternValuesGroup500FieldLength() {
			return PARSING_PATTERN_VALUES_GROUP_500_LENGTH;
		}

}
  
