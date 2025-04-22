package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgOut260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class MsgOut260 extends MsgOut260Serialized {
   
			private List<SysMsgOutArray260> sysMsgOutArray260 = new ArrayList<>();
    	

								private int sysMsgOutMaxCnt260;

								private int sysMsgOutCnt260;

						private char[] consMsgOut260 = new char[300];
	
	/**
	* Constructor for MsgOut260
	**/
    public MsgOut260() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SYS_MSG_OUT_ARRAY_260_SIZE;arrayIndex++) {
						sysMsgOutArray260.add(new SysMsgOutArray260(this, beginSysMsgOutArray260 + 
						arrayIndex * SysMsgOutArray260.getSysMsgOutArray260FieldLength()));
				}
	   	/*  end of offset */
								setSysMsgOutMaxCnt260(20);
								setSysMsgOutCnt260(0);
								setConsMsgOut260(pad(300," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the  value of sysMsgOutArray260
	 *  Corresponding COBOL Variable is 260-SYS-MSG-OUT-ARRAY
	 *	@return sysMsgOutArray260
	 */
   public List<SysMsgOutArray260> getSysMsgOutArray260() {
       return sysMsgOutArray260;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sysMsgOutArray260
	 */
	public SysMsgOutArray260 getSysMsgOutArray260(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSysMsgOutArray260(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SYS_MSG_OUT_ARRAY_260_SIZE) {
             	index = SYS_MSG_OUT_ARRAY_260_SIZE -1; // can't exceed max array size
             	logger.trace("sysMsgOutArray260 - Array index exceeded max Size {}, resetting it to max allowed",SYS_MSG_OUT_ARRAY_260_SIZE); 
	    }
		if (index >= sysMsgOutArray260.size()) {
       		for (int fillIndex =  sysMsgOutArray260.size() -1; fillIndex < index;fillIndex++) {
		       sysMsgOutArray260.add(null);
		    }
			sysMsgOutArray260.set(index,
			   	   	new SysMsgOutArray260(this,beginSysMsgOutArray260 + index * SysMsgOutArray260.getSysMsgOutArray260FieldLength()) 
				                        ); 	
		} 
   	   SysMsgOutArray260 value = sysMsgOutArray260.get(index);
   	   if (value == null) {
   	      sysMsgOutArray260.set(index,
			   	   	new SysMsgOutArray260(this,beginSysMsgOutArray260 + index * SysMsgOutArray260.getSysMsgOutArray260FieldLength()) 
				                        ); 
		  value = sysMsgOutArray260.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SysMsgOutArray260 at index with the passed value
	 *  Corresponding COBOL Variable is 260-SYS-MSG-OUT-ARRAY
	 *  @param index
	 *	@param value
	 */
  public void setSysMsgOutArray260(int index,char[] value) {
   	getSysMsgOutArray260(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of sysMsgOutMaxCnt260
	 *	@return sysMsgOutMaxCnt260
	 */
	public int getSysMsgOutMaxCnt260() throws CFException {
       if (isSysMsgOutMaxCnt260Modified()) { 
           sysMsgOutMaxCnt260 = refreshSysMsgOutMaxCnt260();
        }
   		return sysMsgOutMaxCnt260;
	}
	

	
	   
	/**
	 * 	Update SysMsgOutMaxCnt260 with the passed value
	 *  Corresponding COBOL Variable is 260-SYS-MSG-OUT-MAX-CNT
	 *	@param number
	 */
	public void setSysMsgOutMaxCnt260(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sysMsgOutMaxCnt260 = checkSysMsgOutMaxCnt260MaxLimit(number); 
		serializeSysMsgOutMaxCnt260(sysMsgOutMaxCnt260);
	}
	

	public void setSysMsgOutMaxCnt260(long number) {
	    number = checkSysMsgOutMaxCnt260MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSysMsgOutMaxCnt260((int)number);
	}
	
	/**
	 * 	Update SysMsgOutMaxCnt260 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSysMsgOutMaxCnt260(char[] value) throws CFException {
		 sysMsgOutMaxCnt260 = serializeSysMsgOutMaxCnt260(value);
	}
	/**
	 * 	Update SysMsgOutMaxCnt260 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSysMsgOutMaxCnt260String(char[] value) throws CFException {
		 setSysMsgOutMaxCnt260(value);
	}
	/**
	 *	Returns the value of sysMsgOutCnt260
	 *	@return sysMsgOutCnt260
	 */
	public int getSysMsgOutCnt260() throws CFException {
       if (isSysMsgOutCnt260Modified()) { 
           sysMsgOutCnt260 = refreshSysMsgOutCnt260();
        }
   		return sysMsgOutCnt260;
	}
	

	
	   
	/**
	 * 	Update SysMsgOutCnt260 with the passed value
	 *  Corresponding COBOL Variable is 260-SYS-MSG-OUT-CNT
	 *	@param number
	 */
	public void setSysMsgOutCnt260(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sysMsgOutCnt260 = checkSysMsgOutCnt260MaxLimit(number); 
		serializeSysMsgOutCnt260(sysMsgOutCnt260);
	}
	

	public void setSysMsgOutCnt260(long number) {
	    number = checkSysMsgOutCnt260MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSysMsgOutCnt260((int)number);
	}
	
	/**
	 * 	Update SysMsgOutCnt260 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSysMsgOutCnt260(char[] value) throws CFException {
		 sysMsgOutCnt260 = serializeSysMsgOutCnt260(value);
	}
	/**
	 * 	Update SysMsgOutCnt260 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSysMsgOutCnt260String(char[] value) throws CFException {
		 setSysMsgOutCnt260(value);
	}
	/**
	 *	Returns the value of consMsgOut260
	 *	@return consMsgOut260
	 */
   public char[] getConsMsgOut260() throws CFException{
     if (isConsMsgOut260Modified()) { 
        consMsgOut260 = refreshConsMsgOut260();
     }
   		return consMsgOut260;
   }

  
	/**
	*  set variable consMsgOut260
	*  Corresponding COBOL Variable is 260-CONS-MSG-OUT
	*  @param value
	**/
   public void setConsMsgOut260(char[] value) {
      consMsgOut260 = checkConsMsgOut260Constraints(value);
      serializeConsMsgOut260(consMsgOut260);
   } 

     /**
	 * 	Update ConsMsgOut260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConsMsgOut260(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConsMsgOut260,consMsgOut260.length);
   	
   }
   
   public void setConsMsgOut260(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConsMsgOut260,consMsgOut260.length);
   	
   }
   
     /**
	 * 	Update ConsMsgOut260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConsMsgOut260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConsMsgOut260+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConsMsgOut260 with another Field
	 *	@param value
	 */
   public void setConsMsgOut260(Field source) {
       replace(source,0,source.length(),beginConsMsgOut260,CONS_MSG_OUT_260_LEN);
   	
   }  
   
     /**
	 * 	Update ConsMsgOut260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConsMsgOut260(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConsMsgOut260,CONS_MSG_OUT_260_LEN);
   	
   }
   
     /**
	 * 	Update ConsMsgOut260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConsMsgOut260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConsMsgOut260+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgOut260FieldLength() {
			return MSG_OUT_260_LENGTH;
		}

}
  
