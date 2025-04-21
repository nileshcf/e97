package com.cloudframe.app.ip989010.dto;

/**
*  The class De31S1S2S3S4800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De31S1S2S3S4800 extends De31S1S2S3S4800Serialized { 
   

								private int de31S1800;

								private long de31S2800;

								private int de31S3800;

								private long de31S4800;
	
	/**
	* Constructor for De31S1S2S3S4800
	**/
    public De31S1S2S3S4800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De31S1S2S3S4800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De31S1S2S3S4800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDe31S1800(0);
								setDe31S2800(0L);
								setDe31S3800(0);
								setDe31S4800(0L);
    } 

	/**
	 *	Returns the value of de31S1800
	 *	@return de31S1800
	 */
	public int getDe31S1800() throws CFException {
       if (isDe31S1800Modified()) { 
           de31S1800 = refreshDe31S1800();
        }
   		return de31S1800;
	}
	

	
	   
	/**
	 * 	Update De31S1800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE31-S1
	 *	@param number
	 */
	public void setDe31S1800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de31S1800 = checkDe31S1800MaxLimit(number); 
		serializeDe31S1800(de31S1800);
	}
	

	public void setDe31S1800(long number) {
	    number = checkDe31S1800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe31S1800((int)number);
	}
	
	/**
	 * 	Update De31S1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe31S1800(char[] value) throws CFException {
		 de31S1800 = serializeDe31S1800(value);
	}
	/**
	 * 	Update De31S1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe31S1800String(char[] value) throws CFException {
		 setDe31S1800(value);
	}
	/**
	 *	Returns the value of de31S2800
	 *	@return de31S2800
	 */
	public long getDe31S2800() throws CFException {
       if (isDe31S2800Modified()) { 
           de31S2800 = refreshDe31S2800();
        }
   		return de31S2800;
	}
	

	
	   
	/**
	 * 	Update De31S2800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE31-S2
	 *	@param number
	 */
	public void setDe31S2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    de31S2800 = checkDe31S2800MaxLimit(number); 
		serializeDe31S2800(de31S2800);
	}
	

	/**
	 * 	Update De31S2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe31S2800(char[] value) throws CFException {
		 de31S2800 = serializeDe31S2800(value);
	}
	/**
	 * 	Update De31S2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe31S2800String(char[] value) throws CFException {
		 setDe31S2800(value);
	}
	/**
	 *	Returns the value of de31S3800
	 *	@return de31S3800
	 */
	public int getDe31S3800() throws CFException {
       if (isDe31S3800Modified()) { 
           de31S3800 = refreshDe31S3800();
        }
   		return de31S3800;
	}
	

	
	   
	/**
	 * 	Update De31S3800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE31-S3
	 *	@param number
	 */
	public void setDe31S3800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de31S3800 = checkDe31S3800MaxLimit(number); 
		serializeDe31S3800(de31S3800);
	}
	

	public void setDe31S3800(long number) {
	    number = checkDe31S3800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe31S3800((int)number);
	}
	
	/**
	 * 	Update De31S3800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe31S3800(char[] value) throws CFException {
		 de31S3800 = serializeDe31S3800(value);
	}
	/**
	 * 	Update De31S3800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe31S3800String(char[] value) throws CFException {
		 setDe31S3800(value);
	}
	/**
	 *	Returns the value of de31S4800
	 *	@return de31S4800
	 */
	public long getDe31S4800() throws CFException {
       if (isDe31S4800Modified()) { 
           de31S4800 = refreshDe31S4800();
        }
   		return de31S4800;
	}
	

	
	   
	/**
	 * 	Update De31S4800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE31-S4
	 *	@param number
	 */
	public void setDe31S4800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    de31S4800 = checkDe31S4800MaxLimit(number); 
		serializeDe31S4800(de31S4800);
	}
	

	/**
	 * 	Update De31S4800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe31S4800(char[] value) throws CFException {
		 de31S4800 = serializeDe31S4800(value);
	}
	/**
	 * 	Update De31S4800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe31S4800String(char[] value) throws CFException {
		 setDe31S4800(value);
	}

	
	
	

		public static int getDe31S1S2S3S4800FieldLength() {
			return DE_31_S_1_S_2_S_3_S_4800_LENGTH;
		}

}
  
