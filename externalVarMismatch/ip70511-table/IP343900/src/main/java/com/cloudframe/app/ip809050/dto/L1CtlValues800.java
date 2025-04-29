package com.cloudframe.app.ip809050.dto;

/**
*  The class L1CtlValues800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class L1CtlValues800 extends L1CtlValues800Serialized {
   

						private char[] l1CtlAb800 = new char[3];

								private int l1CtlMti800;

								private int l1CtlFunc800;

						private char[] l1CtlSi800 = new char[1];

						private char[] l1CtlRi800 = new char[1];

								private int l1CtlProcess800;

								private int l1CtlMsgrc800;

						private char[] l1CtlExrc800 = new char[2];

						private char[] l1CtlMccgrp800 = new char[1];

						private char[] l1CtlPrdcode800 = new char[3];

								private int l1CtlBussl800;

								private long l1CtlBussi800;

						private char[] l1CtlIrd800 = new char[2];
	
	/**
	* Constructor for L1CtlValues800
	**/
    public L1CtlValues800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setL1CtlAb800(fillSpace(3));
								setL1CtlMti800(0);
								setL1CtlFunc800(0);
								setL1CtlSi800(fillSpace(1));
								setL1CtlRi800(fillSpace(1));
								setL1CtlProcess800(0);
								setL1CtlMsgrc800(0);
								setL1CtlExrc800(fillSpace(2));
								setL1CtlMccgrp800(fillSpace(1));
								setL1CtlPrdcode800(fillSpace(3));
								setL1CtlBussl800(0);
								setL1CtlBussi800(0L);
								setL1CtlIrd800(fillSpace(2));
    }


 

	/**
	 *	Returns the value of l1CtlAb800
	 *	@return l1CtlAb800
	 */
   public char[] getL1CtlAb800() throws CFException{
     if (isL1CtlAb800Modified()) { 
        l1CtlAb800 = refreshL1CtlAb800();
     }
   		return l1CtlAb800;
   }

  
	/**
	*  set variable l1CtlAb800
	*  Corresponding COBOL Variable is 800-L1-CTL-AB
	*  @param value
	**/
   public void setL1CtlAb800(char[] value) {
      l1CtlAb800 = checkL1CtlAb800Constraints(value);
      serializeL1CtlAb800(l1CtlAb800);
   } 

     /**
	 * 	Update L1CtlAb800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlAb800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlAb800,l1CtlAb800.length);
   	
   }
   
   public void setL1CtlAb800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlAb800,l1CtlAb800.length);
   	
   }
   
     /**
	 * 	Update L1CtlAb800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlAb800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlAb800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlAb800 with another Field
	 *	@param value
	 */
   public void setL1CtlAb800(Field source) {
       replace(source,0,source.length(),beginL1CtlAb800,L_1_CTL_AB_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlAb800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlAb800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlAb800,L_1_CTL_AB_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlAb800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlAb800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlAb800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l1CtlMti800
	 *	@return l1CtlMti800
	 */
	public int getL1CtlMti800() throws CFException {
       if (isL1CtlMti800Modified()) { 
           l1CtlMti800 = refreshL1CtlMti800();
        }
   		return l1CtlMti800;
	}
	

	
	   
	/**
	 * 	Update L1CtlMti800 with the passed value
	 *  Corresponding COBOL Variable is 800-L1-CTL-MTI
	 *	@param number
	 */
	public void setL1CtlMti800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    l1CtlMti800 = checkL1CtlMti800MaxLimit(number); 
		serializeL1CtlMti800(l1CtlMti800);
	}
	

	public void setL1CtlMti800(long number) {
	    number = checkL1CtlMti800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setL1CtlMti800((int)number);
	}
	
	/**
	 * 	Update L1CtlMti800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlMti800(char[] value) throws CFException {
		 l1CtlMti800 = serializeL1CtlMti800(value);
	}
	/**
	 * 	Update L1CtlMti800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlMti800String(char[] value) throws CFException {
		 setL1CtlMti800(value);
	}
	/**
	 *	Returns the value of l1CtlFunc800
	 *	@return l1CtlFunc800
	 */
	public int getL1CtlFunc800() throws CFException {
       if (isL1CtlFunc800Modified()) { 
           l1CtlFunc800 = refreshL1CtlFunc800();
        }
   		return l1CtlFunc800;
	}
	

	
	   
	/**
	 * 	Update L1CtlFunc800 with the passed value
	 *  Corresponding COBOL Variable is 800-L1-CTL-FUNC
	 *	@param number
	 */
	public void setL1CtlFunc800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    l1CtlFunc800 = checkL1CtlFunc800MaxLimit(number); 
		serializeL1CtlFunc800(l1CtlFunc800);
	}
	

	public void setL1CtlFunc800(long number) {
	    number = checkL1CtlFunc800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setL1CtlFunc800((int)number);
	}
	
	/**
	 * 	Update L1CtlFunc800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlFunc800(char[] value) throws CFException {
		 l1CtlFunc800 = serializeL1CtlFunc800(value);
	}
	/**
	 * 	Update L1CtlFunc800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlFunc800String(char[] value) throws CFException {
		 setL1CtlFunc800(value);
	}
	/**
	 *	Returns the value of l1CtlSi800
	 *	@return l1CtlSi800
	 */
   public char[] getL1CtlSi800() throws CFException{
     if (isL1CtlSi800Modified()) { 
        l1CtlSi800 = refreshL1CtlSi800();
     }
   		return l1CtlSi800;
   }

  
	/**
	*  set variable l1CtlSi800
	*  Corresponding COBOL Variable is 800-L1-CTL-SI
	*  @param value
	**/
   public void setL1CtlSi800(char[] value) {
      l1CtlSi800 = checkL1CtlSi800Constraints(value);
      serializeL1CtlSi800(l1CtlSi800);
   } 

     /**
	 * 	Update L1CtlSi800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlSi800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlSi800,l1CtlSi800.length);
   	
   }
   
   public void setL1CtlSi800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlSi800,l1CtlSi800.length);
   	
   }
   
     /**
	 * 	Update L1CtlSi800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlSi800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlSi800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlSi800 with another Field
	 *	@param value
	 */
   public void setL1CtlSi800(Field source) {
       replace(source,0,source.length(),beginL1CtlSi800,L_1_CTL_SI_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlSi800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlSi800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlSi800,L_1_CTL_SI_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlSi800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlSi800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlSi800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l1CtlRi800
	 *	@return l1CtlRi800
	 */
   public char[] getL1CtlRi800() throws CFException{
     if (isL1CtlRi800Modified()) { 
        l1CtlRi800 = refreshL1CtlRi800();
     }
   		return l1CtlRi800;
   }

  
	/**
	*  set variable l1CtlRi800
	*  Corresponding COBOL Variable is 800-L1-CTL-RI
	*  @param value
	**/
   public void setL1CtlRi800(char[] value) {
      l1CtlRi800 = checkL1CtlRi800Constraints(value);
      serializeL1CtlRi800(l1CtlRi800);
   } 

     /**
	 * 	Update L1CtlRi800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlRi800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlRi800,l1CtlRi800.length);
   	
   }
   
   public void setL1CtlRi800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlRi800,l1CtlRi800.length);
   	
   }
   
     /**
	 * 	Update L1CtlRi800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlRi800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlRi800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlRi800 with another Field
	 *	@param value
	 */
   public void setL1CtlRi800(Field source) {
       replace(source,0,source.length(),beginL1CtlRi800,L_1_CTL_RI_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlRi800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlRi800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlRi800,L_1_CTL_RI_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlRi800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlRi800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlRi800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l1CtlProcess800
	 *	@return l1CtlProcess800
	 */
	public int getL1CtlProcess800() throws CFException {
       if (isL1CtlProcess800Modified()) { 
           l1CtlProcess800 = refreshL1CtlProcess800();
        }
   		return l1CtlProcess800;
	}
	

	
	   
	/**
	 * 	Update L1CtlProcess800 with the passed value
	 *  Corresponding COBOL Variable is 800-L1-CTL-PROCESS
	 *	@param number
	 */
	public void setL1CtlProcess800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    l1CtlProcess800 = checkL1CtlProcess800MaxLimit(number); 
		serializeL1CtlProcess800(l1CtlProcess800);
	}
	

	public void setL1CtlProcess800(long number) {
	    number = checkL1CtlProcess800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setL1CtlProcess800((int)number);
	}
	
	/**
	 * 	Update L1CtlProcess800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlProcess800(char[] value) throws CFException {
		 l1CtlProcess800 = serializeL1CtlProcess800(value);
	}
	/**
	 * 	Update L1CtlProcess800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlProcess800String(char[] value) throws CFException {
		 setL1CtlProcess800(value);
	}
	/**
	 *	Returns the value of l1CtlMsgrc800
	 *	@return l1CtlMsgrc800
	 */
	public int getL1CtlMsgrc800() throws CFException {
       if (isL1CtlMsgrc800Modified()) { 
           l1CtlMsgrc800 = refreshL1CtlMsgrc800();
        }
   		return l1CtlMsgrc800;
	}
	

	
	   
	/**
	 * 	Update L1CtlMsgrc800 with the passed value
	 *  Corresponding COBOL Variable is 800-L1-CTL-MSGRC
	 *	@param number
	 */
	public void setL1CtlMsgrc800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    l1CtlMsgrc800 = checkL1CtlMsgrc800MaxLimit(number); 
		serializeL1CtlMsgrc800(l1CtlMsgrc800);
	}
	

	public void setL1CtlMsgrc800(long number) {
	    number = checkL1CtlMsgrc800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setL1CtlMsgrc800((int)number);
	}
	
	/**
	 * 	Update L1CtlMsgrc800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlMsgrc800(char[] value) throws CFException {
		 l1CtlMsgrc800 = serializeL1CtlMsgrc800(value);
	}
	/**
	 * 	Update L1CtlMsgrc800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlMsgrc800String(char[] value) throws CFException {
		 setL1CtlMsgrc800(value);
	}
	/**
	 *	Returns the value of l1CtlExrc800
	 *	@return l1CtlExrc800
	 */
   public char[] getL1CtlExrc800() throws CFException{
     if (isL1CtlExrc800Modified()) { 
        l1CtlExrc800 = refreshL1CtlExrc800();
     }
   		return l1CtlExrc800;
   }

  
	/**
	*  set variable l1CtlExrc800
	*  Corresponding COBOL Variable is 800-L1-CTL-EXRC
	*  @param value
	**/
   public void setL1CtlExrc800(char[] value) {
      l1CtlExrc800 = checkL1CtlExrc800Constraints(value);
      serializeL1CtlExrc800(l1CtlExrc800);
   } 

     /**
	 * 	Update L1CtlExrc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlExrc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlExrc800,l1CtlExrc800.length);
   	
   }
   
   public void setL1CtlExrc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlExrc800,l1CtlExrc800.length);
   	
   }
   
     /**
	 * 	Update L1CtlExrc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlExrc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlExrc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlExrc800 with another Field
	 *	@param value
	 */
   public void setL1CtlExrc800(Field source) {
       replace(source,0,source.length(),beginL1CtlExrc800,L_1_CTL_EXRC_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlExrc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlExrc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlExrc800,L_1_CTL_EXRC_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlExrc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlExrc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlExrc800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l1CtlMccgrp800
	 *	@return l1CtlMccgrp800
	 */
   public char[] getL1CtlMccgrp800() throws CFException{
     if (isL1CtlMccgrp800Modified()) { 
        l1CtlMccgrp800 = refreshL1CtlMccgrp800();
     }
   		return l1CtlMccgrp800;
   }

  
	/**
	*  set variable l1CtlMccgrp800
	*  Corresponding COBOL Variable is 800-L1-CTL-MCCGRP
	*  @param value
	**/
   public void setL1CtlMccgrp800(char[] value) {
      l1CtlMccgrp800 = checkL1CtlMccgrp800Constraints(value);
      serializeL1CtlMccgrp800(l1CtlMccgrp800);
   } 

     /**
	 * 	Update L1CtlMccgrp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlMccgrp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlMccgrp800,l1CtlMccgrp800.length);
   	
   }
   
   public void setL1CtlMccgrp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlMccgrp800,l1CtlMccgrp800.length);
   	
   }
   
     /**
	 * 	Update L1CtlMccgrp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlMccgrp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlMccgrp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlMccgrp800 with another Field
	 *	@param value
	 */
   public void setL1CtlMccgrp800(Field source) {
       replace(source,0,source.length(),beginL1CtlMccgrp800,L_1_CTL_MCCGRP_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlMccgrp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlMccgrp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlMccgrp800,L_1_CTL_MCCGRP_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlMccgrp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlMccgrp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlMccgrp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l1CtlPrdcode800
	 *	@return l1CtlPrdcode800
	 */
   public char[] getL1CtlPrdcode800() throws CFException{
     if (isL1CtlPrdcode800Modified()) { 
        l1CtlPrdcode800 = refreshL1CtlPrdcode800();
     }
   		return l1CtlPrdcode800;
   }

  
	/**
	*  set variable l1CtlPrdcode800
	*  Corresponding COBOL Variable is 800-L1-CTL-PRDCODE
	*  @param value
	**/
   public void setL1CtlPrdcode800(char[] value) {
      l1CtlPrdcode800 = checkL1CtlPrdcode800Constraints(value);
      serializeL1CtlPrdcode800(l1CtlPrdcode800);
   } 

     /**
	 * 	Update L1CtlPrdcode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlPrdcode800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlPrdcode800,l1CtlPrdcode800.length);
   	
   }
   
   public void setL1CtlPrdcode800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlPrdcode800,l1CtlPrdcode800.length);
   	
   }
   
     /**
	 * 	Update L1CtlPrdcode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlPrdcode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlPrdcode800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlPrdcode800 with another Field
	 *	@param value
	 */
   public void setL1CtlPrdcode800(Field source) {
       replace(source,0,source.length(),beginL1CtlPrdcode800,L_1_CTL_PRDCODE_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlPrdcode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlPrdcode800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlPrdcode800,L_1_CTL_PRDCODE_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlPrdcode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlPrdcode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlPrdcode800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of l1CtlBussl800
	 *	@return l1CtlBussl800
	 */
	public int getL1CtlBussl800() throws CFException {
       if (isL1CtlBussl800Modified()) { 
           l1CtlBussl800 = refreshL1CtlBussl800();
        }
   		return l1CtlBussl800;
	}
	

	
	   
	/**
	 * 	Update L1CtlBussl800 with the passed value
	 *  Corresponding COBOL Variable is 800-L1-CTL-BUSSL
	 *	@param number
	 */
	public void setL1CtlBussl800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    l1CtlBussl800 = checkL1CtlBussl800MaxLimit(number); 
		serializeL1CtlBussl800(l1CtlBussl800);
	}
	

	public void setL1CtlBussl800(long number) {
	    number = checkL1CtlBussl800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setL1CtlBussl800((int)number);
	}
	
	/**
	 * 	Update L1CtlBussl800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlBussl800(char[] value) throws CFException {
		 l1CtlBussl800 = serializeL1CtlBussl800(value);
	}
	/**
	 * 	Update L1CtlBussl800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlBussl800String(char[] value) throws CFException {
		 setL1CtlBussl800(value);
	}
	/**
	 *	Returns the value of l1CtlBussi800
	 *	@return l1CtlBussi800
	 */
	public long getL1CtlBussi800() throws CFException {
       if (isL1CtlBussi800Modified()) { 
           l1CtlBussi800 = refreshL1CtlBussi800();
        }
   		return l1CtlBussi800;
	}
	

	
	   
	/**
	 * 	Update L1CtlBussi800 with the passed value
	 *  Corresponding COBOL Variable is 800-L1-CTL-BUSSI
	 *	@param number
	 */
	public void setL1CtlBussi800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    l1CtlBussi800 = checkL1CtlBussi800MaxLimit(number); 
		serializeL1CtlBussi800(l1CtlBussi800);
	}
	

	/**
	 * 	Update L1CtlBussi800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlBussi800(char[] value) throws CFException {
		 l1CtlBussi800 = serializeL1CtlBussi800(value);
	}
	/**
	 * 	Update L1CtlBussi800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlBussi800String(char[] value) throws CFException {
		 setL1CtlBussi800(value);
	}
	/**
	 *	Returns the value of l1CtlIrd800
	 *	@return l1CtlIrd800
	 */
   public char[] getL1CtlIrd800() throws CFException{
     if (isL1CtlIrd800Modified()) { 
        l1CtlIrd800 = refreshL1CtlIrd800();
     }
   		return l1CtlIrd800;
   }

  
	/**
	*  set variable l1CtlIrd800
	*  Corresponding COBOL Variable is 800-L1-CTL-IRD
	*  @param value
	**/
   public void setL1CtlIrd800(char[] value) {
      l1CtlIrd800 = checkL1CtlIrd800Constraints(value);
      serializeL1CtlIrd800(l1CtlIrd800);
   } 

     /**
	 * 	Update L1CtlIrd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setL1CtlIrd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginL1CtlIrd800,l1CtlIrd800.length);
   	
   }
   
   public void setL1CtlIrd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlIrd800,l1CtlIrd800.length);
   	
   }
   
     /**
	 * 	Update L1CtlIrd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlIrd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlIrd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update L1CtlIrd800 with another Field
	 *	@param value
	 */
   public void setL1CtlIrd800(Field source) {
       replace(source,0,source.length(),beginL1CtlIrd800,L_1_CTL_IRD_800_LEN);
   	
   }  
   
     /**
	 * 	Update L1CtlIrd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setL1CtlIrd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginL1CtlIrd800,L_1_CTL_IRD_800_LEN);
   	
   }
   
     /**
	 * 	Update L1CtlIrd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setL1CtlIrd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginL1CtlIrd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getL1CtlValues800FieldLength() {
			return L_1_CTL_VALUES_800_LENGTH;
		}

}
  
