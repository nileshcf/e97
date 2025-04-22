package com.cloudframe.app.crazy88.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.crazy88.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] w300EvalChar = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW300EvalChar(fillSpace(1));
    }


 

	/**
	 *	Returns the value of w300EvalChar
	 *	@return w300EvalChar
	 */
   public char[] getW300EvalChar() throws CFException{
   		return w300EvalChar;
   }

  
	/**
	*  set variable w300EvalChar
	*  Corresponding COBOL Variable is W-300-EVAL-CHAR
	*  @param value
	**/
   public void setW300EvalChar(char[] value) {
       value = checkW300EvalCharConstraints(value);
       arraycopy(value,0,w300EvalChar,0,value.length);
   } 
	public void setW300EvalChar(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,w300EvalChar,0,beginIndex + endIndex);
   }
	static java.util.Set<String> evalChar30088Value = new java.util.HashSet<>();
static { 
	evalChar30088Value.add( "A");
	evalChar30088Value.add( "B");
	evalChar30088Value.add( "C");
	evalChar30088Value.add( "D");
	evalChar30088Value.add( "E");
	evalChar30088Value.add( "F");
	evalChar30088Value.add( "G");
	evalChar30088Value.add( "H");
	evalChar30088Value.add( "I");
	evalChar30088Value.add( "J");
	evalChar30088Value.add( "K");
	evalChar30088Value.add( "L");
	evalChar30088Value.add( "M");
	evalChar30088Value.add( "N");
	evalChar30088Value.add( "O");
	evalChar30088Value.add( "P");
	evalChar30088Value.add( "Q");
	evalChar30088Value.add( "R");
	evalChar30088Value.add( "S");
	evalChar30088Value.add( "T");
	evalChar30088Value.add( "U");
	evalChar30088Value.add( "V");
	evalChar30088Value.add( "W");
	evalChar30088Value.add( "X");
	evalChar30088Value.add( "Y");
	evalChar30088Value.add( "Z");
	evalChar30088Value.add( "0");
	evalChar30088Value.add( "1");
	evalChar30088Value.add( "2");
	evalChar30088Value.add( "3");
	evalChar30088Value.add( "4");
	evalChar30088Value.add( "5");
	evalChar30088Value.add( "6");
	evalChar30088Value.add( "7");
	evalChar30088Value.add( "8");
	evalChar30088Value.add( "9");
	evalChar30088Value.add( "-");
	evalChar30088Value.add( ".");
	evalChar30088Value.add( ",");
	evalChar30088Value.add( "/");
	evalChar30088Value.add( "\\");
} 

	/**
	 *	Test condition "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9" "-" "." "," "/" "\\" for isEvalChar300()
	 *	@return  Returns true if isEvalChar300() is "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9" "-" "." "," "/" "\\"
	 */
   public boolean isEvalChar300() throws CFException {
      return   evalChar30088Value.contains(String.valueOf(getW300EvalChar()));
   }


	/**
	*  set values "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9" "-" "." "," "/" "\\"
	*/
   	public void setEvalChar300True() {  			
    	  setW300EvalChar(evalChar30088Value.iterator().next().toCharArray());
   	}
	
	/**
	 *	Test condition "A" THRU "Z" for isEvalCharLetter300()
	 *	@return  Returns true if isEvalCharLetter300() is "A" THRU "Z"
	 */
   public boolean isEvalCharLetter300() throws CFException {
      return (  isGreaterOrEqual(getW300EvalChar(), "A" ) &&  isLessOrEqual(getW300EvalChar(),"Z" )  );
   }


	/**
	*  set values "A" THRU "Z"
	*/
   	public void setEvalCharLetter300True() {  			
    	setW300EvalChar( "A".toCharArray());
   	}
	char[] evalCharA30088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isEvalCharA300()
	 *	@return  Returns true if isEvalCharA300() is "A"
	 */
   public boolean isEvalCharA300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharA30088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setEvalCharA300True() {  			
    	setW300EvalChar( evalCharA30088Value);
   	}
	char[] evalCharB30088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isEvalCharB300()
	 *	@return  Returns true if isEvalCharB300() is "B"
	 */
   public boolean isEvalCharB300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharB30088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setEvalCharB300True() {  			
    	setW300EvalChar( evalCharB30088Value);
   	}
	char[] evalCharC30088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isEvalCharC300()
	 *	@return  Returns true if isEvalCharC300() is "C"
	 */
   public boolean isEvalCharC300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharC30088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setEvalCharC300True() {  			
    	setW300EvalChar( evalCharC30088Value);
   	}
	char[] evalCharD30088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isEvalCharD300()
	 *	@return  Returns true if isEvalCharD300() is "D"
	 */
   public boolean isEvalCharD300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharD30088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setEvalCharD300True() {  			
    	setW300EvalChar( evalCharD30088Value);
   	}
	char[] evalCharE30088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isEvalCharE300()
	 *	@return  Returns true if isEvalCharE300() is "E"
	 */
   public boolean isEvalCharE300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharE30088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setEvalCharE300True() {  			
    	setW300EvalChar( evalCharE30088Value);
   	}
	char[] evalCharF30088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isEvalCharF300()
	 *	@return  Returns true if isEvalCharF300() is "F"
	 */
   public boolean isEvalCharF300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharF30088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setEvalCharF300True() {  			
    	setW300EvalChar( evalCharF30088Value);
   	}
	char[] evalCharG30088Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isEvalCharG300()
	 *	@return  Returns true if isEvalCharG300() is "G"
	 */
   public boolean isEvalCharG300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharG30088Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setEvalCharG300True() {  			
    	setW300EvalChar( evalCharG30088Value);
   	}
	char[] evalCharH30088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isEvalCharH300()
	 *	@return  Returns true if isEvalCharH300() is "H"
	 */
   public boolean isEvalCharH300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharH30088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setEvalCharH300True() {  			
    	setW300EvalChar( evalCharH30088Value);
   	}
	char[] evalCharI30088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isEvalCharI300()
	 *	@return  Returns true if isEvalCharI300() is "I"
	 */
   public boolean isEvalCharI300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharI30088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setEvalCharI300True() {  			
    	setW300EvalChar( evalCharI30088Value);
   	}
	char[] evalCharJ30088Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isEvalCharJ300()
	 *	@return  Returns true if isEvalCharJ300() is "J"
	 */
   public boolean isEvalCharJ300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharJ30088Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setEvalCharJ300True() {  			
    	setW300EvalChar( evalCharJ30088Value);
   	}
	char[] evalCharK30088Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isEvalCharK300()
	 *	@return  Returns true if isEvalCharK300() is "K"
	 */
   public boolean isEvalCharK300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharK30088Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setEvalCharK300True() {  			
    	setW300EvalChar( evalCharK30088Value);
   	}
	char[] evalCharL30088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isEvalCharL300()
	 *	@return  Returns true if isEvalCharL300() is "L"
	 */
   public boolean isEvalCharL300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharL30088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setEvalCharL300True() {  			
    	setW300EvalChar( evalCharL30088Value);
   	}
	char[] evalCharM30088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isEvalCharM300()
	 *	@return  Returns true if isEvalCharM300() is "M"
	 */
   public boolean isEvalCharM300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharM30088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setEvalCharM300True() {  			
    	setW300EvalChar( evalCharM30088Value);
   	}
	char[] evalCharN30088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isEvalCharN300()
	 *	@return  Returns true if isEvalCharN300() is "N"
	 */
   public boolean isEvalCharN300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharN30088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setEvalCharN300True() {  			
    	setW300EvalChar( evalCharN30088Value);
   	}
	char[] evalCharO30088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isEvalCharO300()
	 *	@return  Returns true if isEvalCharO300() is "O"
	 */
   public boolean isEvalCharO300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharO30088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setEvalCharO300True() {  			
    	setW300EvalChar( evalCharO30088Value);
   	}
	char[] evalCharP30088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isEvalCharP300()
	 *	@return  Returns true if isEvalCharP300() is "P"
	 */
   public boolean isEvalCharP300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharP30088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setEvalCharP300True() {  			
    	setW300EvalChar( evalCharP30088Value);
   	}
	char[] evalCharQ30088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isEvalCharQ300()
	 *	@return  Returns true if isEvalCharQ300() is "Q"
	 */
   public boolean isEvalCharQ300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharQ30088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setEvalCharQ300True() {  			
    	setW300EvalChar( evalCharQ30088Value);
   	}
	char[] evalCharR30088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isEvalCharR300()
	 *	@return  Returns true if isEvalCharR300() is "R"
	 */
   public boolean isEvalCharR300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharR30088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setEvalCharR300True() {  			
    	setW300EvalChar( evalCharR30088Value);
   	}
	char[] evalCharS30088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isEvalCharS300()
	 *	@return  Returns true if isEvalCharS300() is "S"
	 */
   public boolean isEvalCharS300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharS30088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setEvalCharS300True() {  			
    	setW300EvalChar( evalCharS30088Value);
   	}
	char[] evalCharT30088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isEvalCharT300()
	 *	@return  Returns true if isEvalCharT300() is "T"
	 */
   public boolean isEvalCharT300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharT30088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setEvalCharT300True() {  			
    	setW300EvalChar( evalCharT30088Value);
   	}
	char[] evalCharU30088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isEvalCharU300()
	 *	@return  Returns true if isEvalCharU300() is "U"
	 */
   public boolean isEvalCharU300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharU30088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setEvalCharU300True() {  			
    	setW300EvalChar( evalCharU30088Value);
   	}
	char[] evalCharV30088Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isEvalCharV300()
	 *	@return  Returns true if isEvalCharV300() is "V"
	 */
   public boolean isEvalCharV300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharV30088Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setEvalCharV300True() {  			
    	setW300EvalChar( evalCharV30088Value);
   	}
	char[] evalCharW30088Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isEvalCharW300()
	 *	@return  Returns true if isEvalCharW300() is "W"
	 */
   public boolean isEvalCharW300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharW30088Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setEvalCharW300True() {  			
    	setW300EvalChar( evalCharW30088Value);
   	}
	char[] evalCharX30088Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isEvalCharX300()
	 *	@return  Returns true if isEvalCharX300() is "X"
	 */
   public boolean isEvalCharX300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharX30088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setEvalCharX300True() {  			
    	setW300EvalChar( evalCharX30088Value);
   	}
	char[] evalCharY30088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEvalCharY300()
	 *	@return  Returns true if isEvalCharY300() is "Y"
	 */
   public boolean isEvalCharY300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharY30088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEvalCharY300True() {  			
    	setW300EvalChar( evalCharY30088Value);
   	}
	char[] evalCharZ30088Value = "Z".toCharArray();
	/**
	 *	Test condition "Z" for isEvalCharZ300()
	 *	@return  Returns true if isEvalCharZ300() is "Z"
	 */
   public boolean isEvalCharZ300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharZ30088Value)  == 0  );
   }


	/**
	*  set values "Z"
	*/
   	public void setEvalCharZ300True() {  			
    	setW300EvalChar( evalCharZ30088Value);
   	}
	char[] evalChar030088Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isEvalChar0300()
	 *	@return  Returns true if isEvalChar0300() is "0"
	 */
   public boolean isEvalChar0300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar030088Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setEvalChar0300True() {  			
    	setW300EvalChar( evalChar030088Value);
   	}
	char[] evalChar130088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isEvalChar1300()
	 *	@return  Returns true if isEvalChar1300() is "1"
	 */
   public boolean isEvalChar1300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar130088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setEvalChar1300True() {  			
    	setW300EvalChar( evalChar130088Value);
   	}
	char[] evalChar230088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isEvalChar2300()
	 *	@return  Returns true if isEvalChar2300() is "3"
	 */
   public boolean isEvalChar2300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar230088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setEvalChar2300True() {  			
    	setW300EvalChar( evalChar230088Value);
   	}
	char[] evalChar330088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isEvalChar3300()
	 *	@return  Returns true if isEvalChar3300() is "3"
	 */
   public boolean isEvalChar3300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar330088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setEvalChar3300True() {  			
    	setW300EvalChar( evalChar330088Value);
   	}
	char[] evalChar430088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isEvalChar4300()
	 *	@return  Returns true if isEvalChar4300() is "4"
	 */
   public boolean isEvalChar4300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar430088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setEvalChar4300True() {  			
    	setW300EvalChar( evalChar430088Value);
   	}
	char[] evalChar530088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isEvalChar5300()
	 *	@return  Returns true if isEvalChar5300() is "5"
	 */
   public boolean isEvalChar5300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar530088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setEvalChar5300True() {  			
    	setW300EvalChar( evalChar530088Value);
   	}
	char[] evalChar630088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isEvalChar6300()
	 *	@return  Returns true if isEvalChar6300() is "6"
	 */
   public boolean isEvalChar6300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar630088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setEvalChar6300True() {  			
    	setW300EvalChar( evalChar630088Value);
   	}
	char[] evalChar730088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isEvalChar7300()
	 *	@return  Returns true if isEvalChar7300() is "7"
	 */
   public boolean isEvalChar7300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar730088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setEvalChar7300True() {  			
    	setW300EvalChar( evalChar730088Value);
   	}
	char[] evalChar830088Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isEvalChar8300()
	 *	@return  Returns true if isEvalChar8300() is "8"
	 */
   public boolean isEvalChar8300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar830088Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setEvalChar8300True() {  			
    	setW300EvalChar( evalChar830088Value);
   	}
	char[] evalChar930088Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isEvalChar9300()
	 *	@return  Returns true if isEvalChar9300() is "9"
	 */
   public boolean isEvalChar9300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalChar930088Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setEvalChar9300True() {  			
    	setW300EvalChar( evalChar930088Value);
   	}
	char[] evalCharPeriod30088Value = ".".toCharArray();
	/**
	 *	Test condition "." for isEvalCharPeriod300()
	 *	@return  Returns true if isEvalCharPeriod300() is "."
	 */
   public boolean isEvalCharPeriod300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharPeriod30088Value)  == 0  );
   }


	/**
	*  set values "."
	*/
   	public void setEvalCharPeriod300True() {  			
    	setW300EvalChar( evalCharPeriod30088Value);
   	}
	char[] evalCharComma30088Value = ",".toCharArray();
	/**
	 *	Test condition "," for isEvalCharComma300()
	 *	@return  Returns true if isEvalCharComma300() is ","
	 */
   public boolean isEvalCharComma300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharComma30088Value)  == 0  );
   }


	/**
	*  set values ","
	*/
   	public void setEvalCharComma300True() {  			
    	setW300EvalChar( evalCharComma30088Value);
   	}
	char[] evalCharHyphen30088Value = "-".toCharArray();
	/**
	 *	Test condition "-" for isEvalCharHyphen300()
	 *	@return  Returns true if isEvalCharHyphen300() is "-"
	 */
   public boolean isEvalCharHyphen300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharHyphen30088Value)  == 0  );
   }


	/**
	*  set values "-"
	*/
   	public void setEvalCharHyphen300True() {  			
    	setW300EvalChar( evalCharHyphen30088Value);
   	}
	char[] evalCharSlashF30088Value = "/".toCharArray();
	/**
	 *	Test condition "/" for isEvalCharSlashF300()
	 *	@return  Returns true if isEvalCharSlashF300() is "/"
	 */
   public boolean isEvalCharSlashF300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharSlashF30088Value)  == 0  );
   }


	/**
	*  set values "/"
	*/
   	public void setEvalCharSlashF300True() {  			
    	setW300EvalChar( evalCharSlashF30088Value);
   	}
	char[] evalCharSlashB30088Value = "\\".toCharArray();
	/**
	 *	Test condition "\\" for isEvalCharSlashB300()
	 *	@return  Returns true if isEvalCharSlashB300() is "\\"
	 */
   public boolean isEvalCharSlashB300() throws CFException {
      return (  compareChars( getW300EvalChar() , evalCharSlashB30088Value)  == 0  );
   }


	/**
	*  set values "\\"
	*/
   	public void setEvalCharSlashB300True() {  			
    	setW300EvalChar( evalCharSlashB30088Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
