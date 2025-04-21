package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321ReplTextIndicators is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00321ReplTextIndicators extends Ip00321ReplTextIndicatorsSerialized { 
   

								private int ip00321ReplTextInd;
	
	/**
	* Constructor for Ip00321ReplTextIndicators
	**/
    public Ip00321ReplTextIndicators() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00321ReplTextIndicators. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ReplTextIndicators(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00321ReplTextInd
	 *	@return ip00321ReplTextInd
	 */
	public int getIp00321ReplTextInd() throws CFException {
       if (isIp00321ReplTextIndModified()) { 
           ip00321ReplTextInd = refreshIp00321ReplTextInd();
        }
   		return ip00321ReplTextInd;
	}
	

	
	   
	/**
	 * 	Update Ip00321ReplTextInd with the passed value
	 *  Corresponding COBOL Variable is IP00321-REPL-TEXT-IND
	 *	@param number
	 */
	public void setIp00321ReplTextInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00321ReplTextInd = checkIp00321ReplTextIndMaxLimit(number); 
		serializeIp00321ReplTextInd(ip00321ReplTextInd);
	}
	

	public void setIp00321ReplTextInd(long number) {
	    number = checkIp00321ReplTextIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00321ReplTextInd((int)number);
	}
	
	/**
	 * 	Update Ip00321ReplTextInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextInd(char[] value) throws CFException {
		 ip00321ReplTextInd = serializeIp00321ReplTextInd(value);
	}
	/**
	 * 	Update Ip00321ReplTextInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextIndString(char[] value) throws CFException {
		 setIp00321ReplTextInd(value);
	}
	
	/**
	 *	Test condition 1 for isIp00321FieldName88()
	 *	@return  Returns true if isIp00321FieldName88() is 1
	 */
   public boolean isIp00321FieldName88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp00321FieldName88True() {  			
    	setIp00321ReplTextInd( 1);
   	}
	
	/**
	 *	Test condition 2 for isIp00321MesgType88()
	 *	@return  Returns true if isIp00321MesgType88() is 2
	 */
   public boolean isIp00321MesgType88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp00321MesgType88True() {  			
    	setIp00321ReplTextInd( 2);
   	}
	
	/**
	 *	Test condition 3 for isIp00321ValRngLst88()
	 *	@return  Returns true if isIp00321ValRngLst88() is 3
	 */
   public boolean isIp00321ValRngLst88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp00321ValRngLst88True() {  			
    	setIp00321ReplTextInd( 3);
   	}
	
	/**
	 *	Test condition 4 for isIp00321OccurInd88()
	 *	@return  Returns true if isIp00321OccurInd88() is 4
	 */
   public boolean isIp00321OccurInd88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setIp00321OccurInd88True() {  			
    	setIp00321ReplTextInd( 4);
   	}
	
	/**
	 *	Test condition 5 for isIp00321FieldList88()
	 *	@return  Returns true if isIp00321FieldList88() is 5
	 */
   public boolean isIp00321FieldList88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setIp00321FieldList88True() {  			
    	setIp00321ReplTextInd( 5);
   	}
	
	/**
	 *	Test condition 6 for isIp00321FieldLength88()
	 *	@return  Returns true if isIp00321FieldLength88() is 6
	 */
   public boolean isIp00321FieldLength88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setIp00321FieldLength88True() {  			
    	setIp00321ReplTextInd( 6);
   	}
	
	/**
	 *	Test condition 9 for isIp00321SpecificType88()
	 *	@return  Returns true if isIp00321SpecificType88() is 9
	 */
   public boolean isIp00321SpecificType88() throws CFException {
      return (  getIp00321ReplTextInd()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setIp00321SpecificType88True() {  			
    	setIp00321ReplTextInd( 9);
   	}

	
	
	
	/**
	 * 	initializes Ip00321ReplTextIndicators
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00321ReplTextInd(0);
   }

		public static int getIp00321ReplTextIndicatorsFieldLength() {
			return IP_00321_REPL_TEXT_INDICATORS_LENGTH;
		}

}
  
