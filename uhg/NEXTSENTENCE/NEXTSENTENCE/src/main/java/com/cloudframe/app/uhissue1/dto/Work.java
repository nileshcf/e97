package com.cloudframe.app.uhissue1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/


import com.cloudframe.app.uhissue1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private int flag1;

								private int flag2;

								private int flag3;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of flag1
	 *	@return flag1
	 */
	public int getFlag1() throws CFException {
       if (isFlag1Modified()) { 
           flag1 = refreshFlag1();
        }
   		return flag1;
	}
	

	
	   
	/**
	 * 	Update Flag1 with the passed value
	 *  Corresponding COBOL Variable is WS-FLAG1
	 *	@param number
	 */
	public void setFlag1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    flag1 = checkFlag1MaxLimit(number); 
		serializeFlag1(flag1);
	}
	

	public void setFlag1(long number) {
	    number = checkFlag1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlag1((int)number);
	}
	
	/**
	 * 	Update Flag1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFlag1(char[] value) throws CFException {
		 flag1 = serializeFlag1(value);
	}
	/**
	 * 	Update Flag1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFlag1String(char[] value) throws CFException {
		 setFlag1(value);
	}
	
	/**
	 *	Test condition 1 for isFlag1Set()
	 *	@return  Returns true if isFlag1Set() is 1
	 */
   public boolean isFlag1Set() throws CFException {
      return (  getFlag1()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setFlag1SetTrue() {  			
    	setFlag1( 1);
   	}
	
	/**
	 *	Test condition 0 for isFlag1Notset()
	 *	@return  Returns true if isFlag1Notset() is 0
	 */
   public boolean isFlag1Notset() throws CFException {
      return (  getFlag1()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setFlag1NotsetTrue() {  			
    	setFlag1( 0);
   	}
	/**
	 *	Returns the value of flag2
	 *	@return flag2
	 */
	public int getFlag2() throws CFException {
       if (isFlag2Modified()) { 
           flag2 = refreshFlag2();
        }
   		return flag2;
	}
	

	
	   
	/**
	 * 	Update Flag2 with the passed value
	 *  Corresponding COBOL Variable is WS-FLAG2
	 *	@param number
	 */
	public void setFlag2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    flag2 = checkFlag2MaxLimit(number); 
		serializeFlag2(flag2);
	}
	

	public void setFlag2(long number) {
	    number = checkFlag2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlag2((int)number);
	}
	
	/**
	 * 	Update Flag2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFlag2(char[] value) throws CFException {
		 flag2 = serializeFlag2(value);
	}
	/**
	 * 	Update Flag2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFlag2String(char[] value) throws CFException {
		 setFlag2(value);
	}
	
	/**
	 *	Test condition 1 for isFlag2Set()
	 *	@return  Returns true if isFlag2Set() is 1
	 */
   public boolean isFlag2Set() throws CFException {
      return (  getFlag2()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setFlag2SetTrue() {  			
    	setFlag2( 1);
   	}
	
	/**
	 *	Test condition 0 for isFlag2Notset()
	 *	@return  Returns true if isFlag2Notset() is 0
	 */
   public boolean isFlag2Notset() throws CFException {
      return (  getFlag2()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setFlag2NotsetTrue() {  			
    	setFlag2( 0);
   	}
	/**
	 *	Returns the value of flag3
	 *	@return flag3
	 */
	public int getFlag3() throws CFException {
       if (isFlag3Modified()) { 
           flag3 = refreshFlag3();
        }
   		return flag3;
	}
	

	
	   
	/**
	 * 	Update Flag3 with the passed value
	 *  Corresponding COBOL Variable is WS-FLAG3
	 *	@param number
	 */
	public void setFlag3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    flag3 = checkFlag3MaxLimit(number); 
		serializeFlag3(flag3);
	}
	

	public void setFlag3(long number) {
	    number = checkFlag3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlag3((int)number);
	}
	
	/**
	 * 	Update Flag3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFlag3(char[] value) throws CFException {
		 flag3 = serializeFlag3(value);
	}
	/**
	 * 	Update Flag3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFlag3String(char[] value) throws CFException {
		 setFlag3(value);
	}
	
	/**
	 *	Test condition 1 for isFlag3Set()
	 *	@return  Returns true if isFlag3Set() is 1
	 */
   public boolean isFlag3Set() throws CFException {
      return (  getFlag3()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setFlag3SetTrue() {  			
    	setFlag3( 1);
   	}
	
	/**
	 *	Test condition 0 for isFlag3Notset()
	 *	@return  Returns true if isFlag3Notset() is 0
	 */
   public boolean isFlag3Notset() throws CFException {
      return (  getFlag3()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setFlag3NotsetTrue() {  			
    	setFlag3( 0);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
