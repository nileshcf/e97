package com.cloudframe.app.codemove.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.codemove.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;
import java.math.RoundingMode;


public class Work extends WorkSerialized {
   

								private int aaW1Comp94;

								private short aaW1CompS94;

								private long aaW1Comp98;

								private int aaW1CompS98;

								private long aaW1Comp912;

								private long aaW1CompS912;

								private int aaW1Bin94;

								private short aaW1BinS94;

								private long aaW1Bin98;

								private int aaW1BinS98;

								private long aaW1Bin912;

								private long aaW1BinS912;

								private char[] aaW1Edit94 = new char[4];
							

								private char[] aaW1Edit94Nb = new char[4];
							

								private int aaW1Disp94;

								private short aaW1DispS94;

								private long aaW1Disp98;

								private int aaW1DispS98;

								private long aaW1Disp912;

								private long aaW1DispS912;

								private int aaW1Comp394;

								private short aaW1Comp3S94;

								private long aaW1Comp398;

								private int aaW1Comp3S98;

								private long aaW1Comp3912;

								private long aaW1Comp3S912;

								private BigDecimal aaW1Comp3944 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp3S944 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp3984 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp3S984 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp39124 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp3S9124 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp944 = BigDecimal.ZERO;

								private BigDecimal aaW1CompS944 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp984 = BigDecimal.ZERO;

								private BigDecimal aaW1CompS984 = BigDecimal.ZERO;

								private BigDecimal aaW1Comp9124 = BigDecimal.ZERO;

								private BigDecimal aaW1CompS9124 = BigDecimal.ZERO;

								private BigDecimal aaW1Disp944 = BigDecimal.ZERO;

								private BigDecimal aaW1DispS944 = BigDecimal.ZERO;

								private BigDecimal aaW1Disp984 = BigDecimal.ZERO;

								private BigDecimal aaW1DispS984 = BigDecimal.ZERO;

								private BigDecimal aaW1Disp9124 = BigDecimal.ZERO;

								private BigDecimal aaW1DispS9124 = BigDecimal.ZERO;

								private BigDecimal aaW1Bin944 = BigDecimal.ZERO;

								private BigDecimal aaW1BinS944 = BigDecimal.ZERO;

								private BigDecimal aaW1Bin984 = BigDecimal.ZERO;

								private BigDecimal aaW1BinS984 = BigDecimal.ZERO;

								private BigDecimal aaW1Bin9124 = BigDecimal.ZERO;

								private BigDecimal aaW1BinS9124 = BigDecimal.ZERO;

						private char[] aaW1X1 = new char[12];

						private char[] aaW1X2 = new char[12];

						private char[] aaW1X3 = new char[12];

						private char[] aaW1X4 = new char[12];

						private char[] aaW1X5 = new char[12];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAaW1Comp94(1);
								setAaW1CompS94((short)1);
								setAaW1Comp98(1L);
								setAaW1CompS98(1);
								setAaW1Comp912(1L);
								setAaW1CompS912(1L);
								setAaW1Bin94(1);
								setAaW1BinS94((short)1);
								setAaW1Bin98(1L);
								setAaW1BinS98(1);
								setAaW1Bin912(1L);
								setAaW1BinS912(1L);
								setAaW1Edit94(fillSpace(4));
								setAaW1Edit94Nb(fillSpace(4));
								setAaW1Disp94(1);
								setAaW1DispS94((short)1);
								setAaW1Disp98(1L);
								setAaW1DispS98(1);
								setAaW1Disp912(1L);
								setAaW1DispS912(1L);
								setAaW1Comp394(1);
								setAaW1Comp3S94((short)1);
								setAaW1Comp398(1L);
								setAaW1Comp3S98(1);
								setAaW1Comp3912(1L);
								setAaW1Comp3S912(1L);
								setAaW1Comp3944(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp3S944(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp3984(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp3S984(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp39124(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp3S9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp944(BigDecimal.valueOf(1).setScale(2));
								setAaW1CompS944(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp984(BigDecimal.valueOf(1).setScale(2));
								setAaW1CompS984(BigDecimal.valueOf(1).setScale(2));
								setAaW1Comp9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1CompS9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1Disp944(BigDecimal.valueOf(1).setScale(2));
								setAaW1DispS944(BigDecimal.valueOf(1).setScale(2));
								setAaW1Disp984(BigDecimal.valueOf(1).setScale(2));
								setAaW1DispS984(BigDecimal.valueOf(1).setScale(2));
								setAaW1Disp9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1DispS9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1Bin944(BigDecimal.valueOf(1).setScale(2));
								setAaW1BinS944(BigDecimal.valueOf(1).setScale(2));
								setAaW1Bin984(BigDecimal.valueOf(1).setScale(2));
								setAaW1BinS984(BigDecimal.valueOf(1).setScale(2));
								setAaW1Bin9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1BinS9124(BigDecimal.valueOf(1).setScale(2));
								setAaW1X1(fillSpace(12));
								setAaW1X2(fillSpace(12));
								setAaW1X3(fillSpace(12));
								setAaW1X4(fillSpace(12));
								setAaW1X5(fillSpace(12));
    }


 

	/**
	 *	Returns the value of aaW1Comp94
	 *	@return aaW1Comp94
	 */
	public int getAaW1Comp94() throws CFException {
   		return aaW1Comp94;
	}
	
	/**
	 * 	Update AaW1Comp94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-9-4
	 *	@param number
	 */
	public void setAaW1Comp94(int number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1Comp94 = checkAaW1Comp94MaxLimit(number); 
	}


	public void setAaW1Comp94(long number) {
	    number = checkAaW1Comp94MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1Comp94((int)number);
	}
	
	/**
	 *	Returns the value of aaW1CompS94
	 *	@return aaW1CompS94
	 */
	public short getAaW1CompS94() throws CFException {
   		return aaW1CompS94;
	}
	
	/**
	 * 	Update AaW1CompS94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-S9-4
	 *	@param number
	 */
	public void setAaW1CompS94(short number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1CompS94 = checkAaW1CompS94MaxLimit(number); 
	}

	public void setAaW1CompS94(int number) {
	    number = checkAaW1CompS94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1CompS94((short)number);
	}
	public void setAaW1CompS94(long number) {
	    number = checkAaW1CompS94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1CompS94((short)number);
	}
	

	/**
	 *	Returns the value of aaW1Comp98
	 *	@return aaW1Comp98
	 */
	public long getAaW1Comp98() throws CFException {
   		return aaW1Comp98;
	}
	
	/**
	 * 	Update AaW1Comp98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-9-8
	 *	@param number
	 */
	public void setAaW1Comp98(long number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1Comp98 = checkAaW1Comp98MaxLimit(number); 
	}


	/**
	 *	Returns the value of aaW1CompS98
	 *	@return aaW1CompS98
	 */
	public int getAaW1CompS98() throws CFException {
   		return aaW1CompS98;
	}
	
	/**
	 * 	Update AaW1CompS98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-S9-8
	 *	@param number
	 */
	public void setAaW1CompS98(int number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1CompS98 = checkAaW1CompS98MaxLimit(number); 
	}


	public void setAaW1CompS98(long number) {
	    number = checkAaW1CompS98MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1CompS98((int)number);
	}
	
	/**
	 *	Returns the value of aaW1Comp912
	 *	@return aaW1Comp912
	 */
	public long getAaW1Comp912() throws CFException {
   		return aaW1Comp912;
	}
	
	/**
	 * 	Update AaW1Comp912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-9-12
	 *	@param number
	 */
	public void setAaW1Comp912(long number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1Comp912 = checkAaW1Comp912MaxLimit(number); 
	}


	/**
	 *	Returns the value of aaW1CompS912
	 *	@return aaW1CompS912
	 */
	public long getAaW1CompS912() throws CFException {
   		return aaW1CompS912;
	}
	
	/**
	 * 	Update AaW1CompS912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-S9-12
	 *	@param number
	 */
	public void setAaW1CompS912(long number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1CompS912 = checkAaW1CompS912MaxLimit(number); 
	}


	/**
	 *	Returns the value of aaW1Bin94
	 *	@return aaW1Bin94
	 */
	public int getAaW1Bin94() throws CFException {
   		return aaW1Bin94;
	}
	
	/**
	 * 	Update AaW1Bin94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-9-4
	 *	@param number
	 */
	public void setAaW1Bin94(int number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1Bin94 = checkAaW1Bin94MaxLimit(number); 
	}


	public void setAaW1Bin94(long number) {
	    number = checkAaW1Bin94MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1Bin94((int)number);
	}
	
	/**
	 *	Returns the value of aaW1BinS94
	 *	@return aaW1BinS94
	 */
	public short getAaW1BinS94() throws CFException {
   		return aaW1BinS94;
	}
	
	/**
	 * 	Update AaW1BinS94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-S9-4
	 *	@param number
	 */
	public void setAaW1BinS94(short number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1BinS94 = checkAaW1BinS94MaxLimit(number); 
	}

	public void setAaW1BinS94(int number) {
	    number = checkAaW1BinS94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1BinS94((short)number);
	}
	public void setAaW1BinS94(long number) {
	    number = checkAaW1BinS94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1BinS94((short)number);
	}
	

	/**
	 *	Returns the value of aaW1Bin98
	 *	@return aaW1Bin98
	 */
	public long getAaW1Bin98() throws CFException {
   		return aaW1Bin98;
	}
	
	/**
	 * 	Update AaW1Bin98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-9-8
	 *	@param number
	 */
	public void setAaW1Bin98(long number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1Bin98 = checkAaW1Bin98MaxLimit(number); 
	}


	/**
	 *	Returns the value of aaW1BinS98
	 *	@return aaW1BinS98
	 */
	public int getAaW1BinS98() throws CFException {
   		return aaW1BinS98;
	}
	
	/**
	 * 	Update AaW1BinS98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-S9-8
	 *	@param number
	 */
	public void setAaW1BinS98(int number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1BinS98 = checkAaW1BinS98MaxLimit(number); 
	}


	public void setAaW1BinS98(long number) {
	    number = checkAaW1BinS98MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1BinS98((int)number);
	}
	
	/**
	 *	Returns the value of aaW1Bin912
	 *	@return aaW1Bin912
	 */
	public long getAaW1Bin912() throws CFException {
   		return aaW1Bin912;
	}
	
	/**
	 * 	Update AaW1Bin912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-9-12
	 *	@param number
	 */
	public void setAaW1Bin912(long number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1Bin912 = checkAaW1Bin912MaxLimit(number); 
	}


	/**
	 *	Returns the value of aaW1BinS912
	 *	@return aaW1BinS912
	 */
	public long getAaW1BinS912() throws CFException {
   		return aaW1BinS912;
	}
	
	/**
	 * 	Update AaW1BinS912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-S9-12
	 *	@param number
	 */
	public void setAaW1BinS912(long number) {
	     // Truncate if the number is beyond +/- Max range
	    aaW1BinS912 = checkAaW1BinS912MaxLimit(number); 
	}


	/**
	 *	Returns the value of aaW1Edit94
	 *	@return aaW1Edit94
	 */
   public char[] getAaW1Edit94() throws CFException{
     if (isAaW1Edit94Modified()) { 
        aaW1Edit94 = refreshAaW1Edit94();
     }
   		return aaW1Edit94;
   }

  
	/**
	*  set variable aaW1Edit94
	*  Corresponding COBOL Variable is AA-W1-EDIT-9-4
	*  @param value
	**/
   public void setAaW1Edit94(char[] value) {
      aaW1Edit94 = checkAaW1Edit94Constraints(value);
      serializeAaW1Edit94(aaW1Edit94);
   } 

     /**
	 * 	Update AaW1Edit94 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAaW1Edit94(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAaW1Edit94,aaW1Edit94.length);
   	
   }
   
   public void setAaW1Edit94(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAaW1Edit94,aaW1Edit94.length);
   	
   }
   
     /**
	 * 	Update AaW1Edit94 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAaW1Edit94(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAaW1Edit94+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AaW1Edit94 with another Field
	 *	@param value
	 */
   public void setAaW1Edit94(Field source) {
       replace(source,0,source.length(),beginAaW1Edit94,AA_W_1_EDIT_94_LEN);
   	
   }  
   
     /**
	 * 	Update AaW1Edit94 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAaW1Edit94(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAaW1Edit94,AA_W_1_EDIT_94_LEN);
   	
   }
   
     /**
	 * 	Update AaW1Edit94 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAaW1Edit94(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAaW1Edit94+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aaW1Edit94Nb
	 *	@return aaW1Edit94Nb
	 */
   public char[] getAaW1Edit94Nb() throws CFException{
     if (isAaW1Edit94NbModified()) { 
        aaW1Edit94Nb = refreshAaW1Edit94Nb();
     }
   		return aaW1Edit94Nb;
   }

  
	/**
	*  set variable aaW1Edit94Nb
	*  Corresponding COBOL Variable is AA-W1-EDIT-9-4-NB
	*  @param value
	**/
   public void setAaW1Edit94Nb(char[] value) {
      aaW1Edit94Nb = checkAaW1Edit94NbConstraints(value);
      serializeAaW1Edit94Nb(aaW1Edit94Nb);
   } 

     /**
	 * 	Update AaW1Edit94Nb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAaW1Edit94Nb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAaW1Edit94Nb,aaW1Edit94Nb.length);
   	
   }
   
   public void setAaW1Edit94Nb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAaW1Edit94Nb,aaW1Edit94Nb.length);
   	
   }
   
     /**
	 * 	Update AaW1Edit94Nb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAaW1Edit94Nb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAaW1Edit94Nb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AaW1Edit94Nb with another Field
	 *	@param value
	 */
   public void setAaW1Edit94Nb(Field source) {
       replace(source,0,source.length(),beginAaW1Edit94Nb,AA_W_1_EDIT_94_NB_LEN);
   	
   }  
   
     /**
	 * 	Update AaW1Edit94Nb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAaW1Edit94Nb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAaW1Edit94Nb,AA_W_1_EDIT_94_NB_LEN);
   	
   }
   
     /**
	 * 	Update AaW1Edit94Nb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAaW1Edit94Nb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAaW1Edit94Nb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aaW1Disp94
	 *	@return aaW1Disp94
	 */
	public int getAaW1Disp94() throws CFException {
       if (isAaW1Disp94Modified()) { 
           aaW1Disp94 = refreshAaW1Disp94();
        }
   		return aaW1Disp94;
	}
	

	
	   
	/**
	 * 	Update AaW1Disp94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-DISP-9-4
	 *	@param number
	 */
	public void setAaW1Disp94(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    aaW1Disp94 = checkAaW1Disp94MaxLimit(number); 
		serializeAaW1Disp94(aaW1Disp94);
	}
	

	public void setAaW1Disp94(long number) {
	    number = checkAaW1Disp94MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1Disp94((int)number);
	}
	
	/**
	 * 	Update AaW1Disp94 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp94(char[] value) throws CFException {
		 aaW1Disp94 = serializeAaW1Disp94(value);
	}
	/**
	 * 	Update AaW1Disp94 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp94String(char[] value) throws CFException {
		 setAaW1Disp94(value);
	}
	/**
	 *	Returns the value of aaW1DispS94
	 *	@return aaW1DispS94
	 */
	public short getAaW1DispS94() throws CFException {
       if (isAaW1DispS94Modified()) { 
           aaW1DispS94 = refreshAaW1DispS94();
        }
   		return aaW1DispS94;
	}
	

    /**
	 *	Returns the String value of aaW1DispS94
	 *	@return aaW1DispS94
	 */
	public char[]  getAaW1DispS94ActualString() {
	    String value = String.valueOf(aaW1DispS94).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AaW1DispS94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-DISP-S9-4
	 *	@param number
	 */
	public void setAaW1DispS94(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    aaW1DispS94 = checkAaW1DispS94MaxLimit(number); 
		serializeAaW1DispS94(aaW1DispS94);
	}
	
	public void setAaW1DispS94(int number) {
	    number = checkAaW1DispS94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1DispS94((short)number);
	}
	public void setAaW1DispS94(long number) {
	    number = checkAaW1DispS94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1DispS94((short)number);
	}
	

	/**
	 * 	Update AaW1DispS94 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS94(char[] value) throws CFException {
		 aaW1DispS94 = serializeAaW1DispS94(value);
	}
	/**
	 * 	Update AaW1DispS94 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS94String(char[] value) throws CFException {
		 setAaW1DispS94(value);
	}
	/**
	 *	Returns the value of aaW1Disp98
	 *	@return aaW1Disp98
	 */
	public long getAaW1Disp98() throws CFException {
       if (isAaW1Disp98Modified()) { 
           aaW1Disp98 = refreshAaW1Disp98();
        }
   		return aaW1Disp98;
	}
	

	
	   
	/**
	 * 	Update AaW1Disp98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-DISP-9-8
	 *	@param number
	 */
	public void setAaW1Disp98(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    aaW1Disp98 = checkAaW1Disp98MaxLimit(number); 
		serializeAaW1Disp98(aaW1Disp98);
	}
	

	/**
	 * 	Update AaW1Disp98 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp98(char[] value) throws CFException {
		 aaW1Disp98 = serializeAaW1Disp98(value);
	}
	/**
	 * 	Update AaW1Disp98 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp98String(char[] value) throws CFException {
		 setAaW1Disp98(value);
	}
	/**
	 *	Returns the value of aaW1DispS98
	 *	@return aaW1DispS98
	 */
	public int getAaW1DispS98() throws CFException {
       if (isAaW1DispS98Modified()) { 
           aaW1DispS98 = refreshAaW1DispS98();
        }
   		return aaW1DispS98;
	}
	

    /**
	 *	Returns the String value of aaW1DispS98
	 *	@return aaW1DispS98
	 */
	public char[]  getAaW1DispS98ActualString() {
	    String value = String.valueOf(aaW1DispS98).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AaW1DispS98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-DISP-S9-8
	 *	@param number
	 */
	public void setAaW1DispS98(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    aaW1DispS98 = checkAaW1DispS98MaxLimit(number); 
		serializeAaW1DispS98(aaW1DispS98);
	}
	

	public void setAaW1DispS98(long number) {
	    number = checkAaW1DispS98MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1DispS98((int)number);
	}
	
	/**
	 * 	Update AaW1DispS98 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS98(char[] value) throws CFException {
		 aaW1DispS98 = serializeAaW1DispS98(value);
	}
	/**
	 * 	Update AaW1DispS98 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS98String(char[] value) throws CFException {
		 setAaW1DispS98(value);
	}
	/**
	 *	Returns the value of aaW1Disp912
	 *	@return aaW1Disp912
	 */
	public long getAaW1Disp912() throws CFException {
       if (isAaW1Disp912Modified()) { 
           aaW1Disp912 = refreshAaW1Disp912();
        }
   		return aaW1Disp912;
	}
	

	
	   
	/**
	 * 	Update AaW1Disp912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-DISP-9-12
	 *	@param number
	 */
	public void setAaW1Disp912(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    aaW1Disp912 = checkAaW1Disp912MaxLimit(number); 
		serializeAaW1Disp912(aaW1Disp912);
	}
	

	/**
	 * 	Update AaW1Disp912 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp912(char[] value) throws CFException {
		 aaW1Disp912 = serializeAaW1Disp912(value);
	}
	/**
	 * 	Update AaW1Disp912 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp912String(char[] value) throws CFException {
		 setAaW1Disp912(value);
	}
	/**
	 *	Returns the value of aaW1DispS912
	 *	@return aaW1DispS912
	 */
	public long getAaW1DispS912() throws CFException {
       if (isAaW1DispS912Modified()) { 
           aaW1DispS912 = refreshAaW1DispS912();
        }
   		return aaW1DispS912;
	}
	

    /**
	 *	Returns the String value of aaW1DispS912
	 *	@return aaW1DispS912
	 */
	public char[]  getAaW1DispS912ActualString() {
	    String value = String.valueOf(aaW1DispS912).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AaW1DispS912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-DISP-S9-12
	 *	@param number
	 */
	public void setAaW1DispS912(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    aaW1DispS912 = checkAaW1DispS912MaxLimit(number); 
		serializeAaW1DispS912(aaW1DispS912);
	}
	

	/**
	 * 	Update AaW1DispS912 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS912(char[] value) throws CFException {
		 aaW1DispS912 = serializeAaW1DispS912(value);
	}
	/**
	 * 	Update AaW1DispS912 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS912String(char[] value) throws CFException {
		 setAaW1DispS912(value);
	}
	public int getAaW1Comp394() throws CFException {
        if (isAaW1Comp394Modified()) { 
           aaW1Comp394 = refreshAaW1Comp394();
        }
   		return aaW1Comp394;
	}
	
	/**
	 * 	Update AaW1Comp394 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-9-4
	 *	@param number
	 */
	public void setAaW1Comp394(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			aaW1Comp394 = checkAaW1Comp394MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeAaW1Comp394(aaW1Comp394);
	}


	public void setAaW1Comp394(long number) {
	    number = checkAaW1Comp394MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1Comp394((int)number);
	}
	
	public short getAaW1Comp3S94() throws CFException {
        if (isAaW1Comp3S94Modified()) { 
           aaW1Comp3S94 = refreshAaW1Comp3S94();
        }
   		return aaW1Comp3S94;
	}
	
	/**
	 * 	Update AaW1Comp3S94 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-S9-4
	 *	@param number
	 */
	public void setAaW1Comp3S94(short number) {
			aaW1Comp3S94 = checkAaW1Comp3S94MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeAaW1Comp3S94(aaW1Comp3S94);
	}

	public void setAaW1Comp3S94(int number) {
	    number = checkAaW1Comp3S94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1Comp3S94((short)number);
	}
	public void setAaW1Comp3S94(long number) {
	    number = checkAaW1Comp3S94MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAaW1Comp3S94((short)number);
	}
	

	public long getAaW1Comp398() throws CFException {
        if (isAaW1Comp398Modified()) { 
           aaW1Comp398 = refreshAaW1Comp398();
        }
   		return aaW1Comp398;
	}
	
	/**
	 * 	Update AaW1Comp398 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-9-8
	 *	@param number
	 */
	public void setAaW1Comp398(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			aaW1Comp398 = checkAaW1Comp398MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeAaW1Comp398(aaW1Comp398);
	}


	public int getAaW1Comp3S98() throws CFException {
        if (isAaW1Comp3S98Modified()) { 
           aaW1Comp3S98 = refreshAaW1Comp3S98();
        }
   		return aaW1Comp3S98;
	}
	
	/**
	 * 	Update AaW1Comp3S98 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-S9-8
	 *	@param number
	 */
	public void setAaW1Comp3S98(int number) {
			aaW1Comp3S98 = checkAaW1Comp3S98MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeAaW1Comp3S98(aaW1Comp3S98);
	}


	public void setAaW1Comp3S98(long number) {
	    number = checkAaW1Comp3S98MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAaW1Comp3S98((int)number);
	}
	
	public long getAaW1Comp3912() throws CFException {
        if (isAaW1Comp3912Modified()) { 
           aaW1Comp3912 = refreshAaW1Comp3912();
        }
   		return aaW1Comp3912;
	}
	
	/**
	 * 	Update AaW1Comp3912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-9-12
	 *	@param number
	 */
	public void setAaW1Comp3912(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			aaW1Comp3912 = checkAaW1Comp3912MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeAaW1Comp3912(aaW1Comp3912);
	}


	public long getAaW1Comp3S912() throws CFException {
        if (isAaW1Comp3S912Modified()) { 
           aaW1Comp3S912 = refreshAaW1Comp3S912();
        }
   		return aaW1Comp3S912;
	}
	
	/**
	 * 	Update AaW1Comp3S912 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-S9-12
	 *	@param number
	 */
	public void setAaW1Comp3S912(long number) {
			aaW1Comp3S912 = checkAaW1Comp3S912MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeAaW1Comp3S912(aaW1Comp3S912);
	}


	public BigDecimal getAaW1Comp3944() throws CFException {
        if (isAaW1Comp3944Modified()) { 
           aaW1Comp3944 = refreshAaW1Comp3944();
        }
   		return aaW1Comp3944;
	}

    public char[] getAaW1Comp3944String() {
          return  aaW1Comp3944String();
    }
	
	/**
	 * 	Update AaW1Comp3944 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-9-44
	 *	@param number
	 */
	public void setAaW1Comp3944(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     aaW1Comp3944 = checkAaW1Comp3944MaxLimit(number);
	    serializeAaW1Comp3944(aaW1Comp3944);
   }
	public BigDecimal getAaW1Comp3S944() throws CFException {
        if (isAaW1Comp3S944Modified()) { 
           aaW1Comp3S944 = refreshAaW1Comp3S944();
        }
   		return aaW1Comp3S944;
	}

    public char[] getAaW1Comp3S944String() {
          return  aaW1Comp3S944String();
    }
	
	/**
	 * 	Update AaW1Comp3S944 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-S9-44
	 *	@param number
	 */
	public void setAaW1Comp3S944(BigDecimal number) {	
     aaW1Comp3S944 = checkAaW1Comp3S944MaxLimit(number);
	    serializeAaW1Comp3S944(aaW1Comp3S944);
   }
	public BigDecimal getAaW1Comp3984() throws CFException {
        if (isAaW1Comp3984Modified()) { 
           aaW1Comp3984 = refreshAaW1Comp3984();
        }
   		return aaW1Comp3984;
	}

    public char[] getAaW1Comp3984String() {
          return  aaW1Comp3984String();
    }
	
	/**
	 * 	Update AaW1Comp3984 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-9-84
	 *	@param number
	 */
	public void setAaW1Comp3984(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     aaW1Comp3984 = checkAaW1Comp3984MaxLimit(number);
	    serializeAaW1Comp3984(aaW1Comp3984);
   }
	public BigDecimal getAaW1Comp3S984() throws CFException {
        if (isAaW1Comp3S984Modified()) { 
           aaW1Comp3S984 = refreshAaW1Comp3S984();
        }
   		return aaW1Comp3S984;
	}

    public char[] getAaW1Comp3S984String() {
          return  aaW1Comp3S984String();
    }
	
	/**
	 * 	Update AaW1Comp3S984 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-S9-84
	 *	@param number
	 */
	public void setAaW1Comp3S984(BigDecimal number) {	
     aaW1Comp3S984 = checkAaW1Comp3S984MaxLimit(number);
	    serializeAaW1Comp3S984(aaW1Comp3S984);
   }
	public BigDecimal getAaW1Comp39124() throws CFException {
        if (isAaW1Comp39124Modified()) { 
           aaW1Comp39124 = refreshAaW1Comp39124();
        }
   		return aaW1Comp39124;
	}

    public char[] getAaW1Comp39124String() {
          return  aaW1Comp39124String();
    }
	
	/**
	 * 	Update AaW1Comp39124 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-9-124
	 *	@param number
	 */
	public void setAaW1Comp39124(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     aaW1Comp39124 = checkAaW1Comp39124MaxLimit(number);
	    serializeAaW1Comp39124(aaW1Comp39124);
   }
	public BigDecimal getAaW1Comp3S9124() throws CFException {
        if (isAaW1Comp3S9124Modified()) { 
           aaW1Comp3S9124 = refreshAaW1Comp3S9124();
        }
   		return aaW1Comp3S9124;
	}

    public char[] getAaW1Comp3S9124String() {
          return  aaW1Comp3S9124String();
    }
	
	/**
	 * 	Update AaW1Comp3S9124 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-COMP-3-S9-124
	 *	@param number
	 */
	public void setAaW1Comp3S9124(BigDecimal number) {	
     aaW1Comp3S9124 = checkAaW1Comp3S9124MaxLimit(number);
	    serializeAaW1Comp3S9124(aaW1Comp3S9124);
   }
	/**
	 *	Returns the value of aaW1Comp944
	 *	@return aaW1Comp944
	 */
	public BigDecimal getAaW1Comp944() throws CFException {
   		return aaW1Comp944;
	}
	
	
	/**
	 * 	Update AaW1Comp944 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-9-44
	 *	@param number
	 */
	public void setAaW1Comp944(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		aaW1Comp944 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1CompS944
	 *	@return aaW1CompS944
	 */
	public BigDecimal getAaW1CompS944() throws CFException {
   		return aaW1CompS944;
	}
	
	
	/**
	 * 	Update AaW1CompS944 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-S9-44
	 *	@param number
	 */
	public void setAaW1CompS944(BigDecimal number) {
		aaW1CompS944 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1Comp984
	 *	@return aaW1Comp984
	 */
	public BigDecimal getAaW1Comp984() throws CFException {
   		return aaW1Comp984;
	}
	
	
	/**
	 * 	Update AaW1Comp984 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-9-84
	 *	@param number
	 */
	public void setAaW1Comp984(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		aaW1Comp984 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1CompS984
	 *	@return aaW1CompS984
	 */
	public BigDecimal getAaW1CompS984() throws CFException {
   		return aaW1CompS984;
	}
	
	
	/**
	 * 	Update AaW1CompS984 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-S9-84
	 *	@param number
	 */
	public void setAaW1CompS984(BigDecimal number) {
		aaW1CompS984 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1Comp9124
	 *	@return aaW1Comp9124
	 */
	public BigDecimal getAaW1Comp9124() throws CFException {
   		return aaW1Comp9124;
	}
	
	
	/**
	 * 	Update AaW1Comp9124 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-9-124
	 *	@param number
	 */
	public void setAaW1Comp9124(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		aaW1Comp9124 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1CompS9124
	 *	@return aaW1CompS9124
	 */
	public BigDecimal getAaW1CompS9124() throws CFException {
   		return aaW1CompS9124;
	}
	
	
	/**
	 * 	Update AaW1CompS9124 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-COMP-S9-124
	 *	@param number
	 */
	public void setAaW1CompS9124(BigDecimal number) {
		aaW1CompS9124 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1Disp944
	 *	@return aaW1Disp944
	 */
	public BigDecimal getAaW1Disp944() throws CFException {
       if (isAaW1Disp944Modified()) { 
           aaW1Disp944 = refreshAaW1Disp944();
        }
   		return aaW1Disp944;
	}
	

	
	   
	/**
	 * 	Update AaW1Disp944 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-DISP-9-44
	 *	@param number
	 */
	public void setAaW1Disp944(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       aaW1Disp944 = checkAaW1Disp944MaxLimit(number);
	    serializeAaW1Disp944(aaW1Disp944);
   }
	/**
	 * 	Update AaW1Disp944 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp944(char[] value) throws CFException {
		 aaW1Disp944 = serializeAaW1Disp944(value);
	}   
	/**
	 *	Returns the value of aaW1DispS944
	 *	@return aaW1DispS944
	 */
	public BigDecimal getAaW1DispS944() throws CFException {
       if (isAaW1DispS944Modified()) { 
           aaW1DispS944 = refreshAaW1DispS944();
        }
   		return aaW1DispS944;
	}
	

    /**
	 *	Returns the String value of aaW1DispS944
	 *	@return aaW1DispS944
	 */
	public char[]  getAaW1DispS944ActualString() {
	    String value = String.valueOf(aaW1DispS944).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AaW1DispS944 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-DISP-S9-44
	 *	@param number
	 */
	public void setAaW1DispS944(BigDecimal number) {
       aaW1DispS944 = checkAaW1DispS944MaxLimit(number);
	    serializeAaW1DispS944(aaW1DispS944);
   }
	/**
	 * 	Update AaW1DispS944 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS944(char[] value) throws CFException {
		 aaW1DispS944 = serializeAaW1DispS944(value);
	}   
	/**
	 *	Returns the value of aaW1Disp984
	 *	@return aaW1Disp984
	 */
	public BigDecimal getAaW1Disp984() throws CFException {
       if (isAaW1Disp984Modified()) { 
           aaW1Disp984 = refreshAaW1Disp984();
        }
   		return aaW1Disp984;
	}
	

	
	   
	/**
	 * 	Update AaW1Disp984 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-DISP-9-84
	 *	@param number
	 */
	public void setAaW1Disp984(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       aaW1Disp984 = checkAaW1Disp984MaxLimit(number);
	    serializeAaW1Disp984(aaW1Disp984);
   }
	/**
	 * 	Update AaW1Disp984 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp984(char[] value) throws CFException {
		 aaW1Disp984 = serializeAaW1Disp984(value);
	}   
	/**
	 *	Returns the value of aaW1DispS984
	 *	@return aaW1DispS984
	 */
	public BigDecimal getAaW1DispS984() throws CFException {
       if (isAaW1DispS984Modified()) { 
           aaW1DispS984 = refreshAaW1DispS984();
        }
   		return aaW1DispS984;
	}
	

    /**
	 *	Returns the String value of aaW1DispS984
	 *	@return aaW1DispS984
	 */
	public char[]  getAaW1DispS984ActualString() {
	    String value = String.valueOf(aaW1DispS984).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AaW1DispS984 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-DISP-S9-84
	 *	@param number
	 */
	public void setAaW1DispS984(BigDecimal number) {
       aaW1DispS984 = checkAaW1DispS984MaxLimit(number);
	    serializeAaW1DispS984(aaW1DispS984);
   }
	/**
	 * 	Update AaW1DispS984 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS984(char[] value) throws CFException {
		 aaW1DispS984 = serializeAaW1DispS984(value);
	}   
	/**
	 *	Returns the value of aaW1Disp9124
	 *	@return aaW1Disp9124
	 */
	public BigDecimal getAaW1Disp9124() throws CFException {
       if (isAaW1Disp9124Modified()) { 
           aaW1Disp9124 = refreshAaW1Disp9124();
        }
   		return aaW1Disp9124;
	}
	

	
	   
	/**
	 * 	Update AaW1Disp9124 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-DISP-9-124
	 *	@param number
	 */
	public void setAaW1Disp9124(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       aaW1Disp9124 = checkAaW1Disp9124MaxLimit(number);
	    serializeAaW1Disp9124(aaW1Disp9124);
   }
	/**
	 * 	Update AaW1Disp9124 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1Disp9124(char[] value) throws CFException {
		 aaW1Disp9124 = serializeAaW1Disp9124(value);
	}   
	/**
	 *	Returns the value of aaW1DispS9124
	 *	@return aaW1DispS9124
	 */
	public BigDecimal getAaW1DispS9124() throws CFException {
       if (isAaW1DispS9124Modified()) { 
           aaW1DispS9124 = refreshAaW1DispS9124();
        }
   		return aaW1DispS9124;
	}
	

    /**
	 *	Returns the String value of aaW1DispS9124
	 *	@return aaW1DispS9124
	 */
	public char[]  getAaW1DispS9124ActualString() {
	    String value = String.valueOf(aaW1DispS9124).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AaW1DispS9124 with the passed number
	 *  Corresponding COBOL Variable is AA-W1-DISP-S9-124
	 *	@param number
	 */
	public void setAaW1DispS9124(BigDecimal number) {
       aaW1DispS9124 = checkAaW1DispS9124MaxLimit(number);
	    serializeAaW1DispS9124(aaW1DispS9124);
   }
	/**
	 * 	Update AaW1DispS9124 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAaW1DispS9124(char[] value) throws CFException {
		 aaW1DispS9124 = serializeAaW1DispS9124(value);
	}   
	/**
	 *	Returns the value of aaW1Bin944
	 *	@return aaW1Bin944
	 */
	public BigDecimal getAaW1Bin944() throws CFException {
   		return aaW1Bin944;
	}
	
	
	/**
	 * 	Update AaW1Bin944 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-9-44
	 *	@param number
	 */
	public void setAaW1Bin944(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		aaW1Bin944 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1BinS944
	 *	@return aaW1BinS944
	 */
	public BigDecimal getAaW1BinS944() throws CFException {
   		return aaW1BinS944;
	}
	
	
	/**
	 * 	Update AaW1BinS944 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-S9-44
	 *	@param number
	 */
	public void setAaW1BinS944(BigDecimal number) {
		aaW1BinS944 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1Bin984
	 *	@return aaW1Bin984
	 */
	public BigDecimal getAaW1Bin984() throws CFException {
   		return aaW1Bin984;
	}
	
	
	/**
	 * 	Update AaW1Bin984 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-9-84
	 *	@param number
	 */
	public void setAaW1Bin984(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		aaW1Bin984 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1BinS984
	 *	@return aaW1BinS984
	 */
	public BigDecimal getAaW1BinS984() throws CFException {
   		return aaW1BinS984;
	}
	
	
	/**
	 * 	Update AaW1BinS984 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-S9-84
	 *	@param number
	 */
	public void setAaW1BinS984(BigDecimal number) {
		aaW1BinS984 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1Bin9124
	 *	@return aaW1Bin9124
	 */
	public BigDecimal getAaW1Bin9124() throws CFException {
   		return aaW1Bin9124;
	}
	
	
	/**
	 * 	Update AaW1Bin9124 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-9-124
	 *	@param number
	 */
	public void setAaW1Bin9124(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		aaW1Bin9124 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1BinS9124
	 *	@return aaW1BinS9124
	 */
	public BigDecimal getAaW1BinS9124() throws CFException {
   		return aaW1BinS9124;
	}
	
	
	/**
	 * 	Update AaW1BinS9124 with the passed value
	 *  Corresponding COBOL Variable is AA-W1-BIN-S9-124
	 *	@param number
	 */
	public void setAaW1BinS9124(BigDecimal number) {
		aaW1BinS9124 = number.setScale(2,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of aaW1X1
	 *	@return aaW1X1
	 */
   public char[] getAaW1X1() throws CFException{
   		return aaW1X1;
   }

  
	/**
	*  set variable aaW1X1
	*  Corresponding COBOL Variable is AA-W1-X1
	*  @param value
	**/
   public void setAaW1X1(char[] value) {
       value = checkAaW1X1Constraints(value);
       arraycopy(value,0,aaW1X1,0,value.length);
   } 
	public void setAaW1X1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aaW1X1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aaW1X2
	 *	@return aaW1X2
	 */
   public char[] getAaW1X2() throws CFException{
   		return aaW1X2;
   }

  
	/**
	*  set variable aaW1X2
	*  Corresponding COBOL Variable is AA-W1-X2
	*  @param value
	**/
   public void setAaW1X2(char[] value) {
       value = checkAaW1X2Constraints(value);
       arraycopy(value,0,aaW1X2,0,value.length);
   } 
	public void setAaW1X2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aaW1X2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aaW1X3
	 *	@return aaW1X3
	 */
   public char[] getAaW1X3() throws CFException{
   		return aaW1X3;
   }

  
	/**
	*  set variable aaW1X3
	*  Corresponding COBOL Variable is AA-W1-X3
	*  @param value
	**/
   public void setAaW1X3(char[] value) {
       value = checkAaW1X3Constraints(value);
       arraycopy(value,0,aaW1X3,0,value.length);
   } 
	public void setAaW1X3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aaW1X3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aaW1X4
	 *	@return aaW1X4
	 */
   public char[] getAaW1X4() throws CFException{
   		return aaW1X4;
   }

  
	/**
	*  set variable aaW1X4
	*  Corresponding COBOL Variable is AA-W1-X4
	*  @param value
	**/
   public void setAaW1X4(char[] value) {
       value = checkAaW1X4Constraints(value);
       arraycopy(value,0,aaW1X4,0,value.length);
   } 
	public void setAaW1X4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aaW1X4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aaW1X5
	 *	@return aaW1X5
	 */
   public char[] getAaW1X5() throws CFException{
   		return aaW1X5;
   }

  
	/**
	*  set variable aaW1X5
	*  Corresponding COBOL Variable is AA-W1-X5
	*  @param value
	**/
   public void setAaW1X5(char[] value) {
       value = checkAaW1X5Constraints(value);
       arraycopy(value,0,aaW1X5,0,value.length);
   } 
	public void setAaW1X5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aaW1X5,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
