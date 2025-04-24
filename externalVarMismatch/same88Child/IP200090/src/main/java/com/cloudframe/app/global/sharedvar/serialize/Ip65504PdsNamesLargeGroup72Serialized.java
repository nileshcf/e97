package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup72Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup72Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup72Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_72_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2202S;
            protected  int beginIp65504P2202L;
            protected  int beginIp65504P2203S;
            protected  int beginIp65504P2203L;
            protected  int beginIp65504P2204S;
            protected  int beginIp65504P2204L;
            protected  int beginIp65504P2205S;
            protected  int beginIp65504P2205L;
            protected  int beginIp65504P2206S;
            protected  int beginIp65504P2206L;
            protected  int beginIp65504P2207S;
            protected  int beginIp65504P2207L;
            protected  int beginIp65504P2208S;
            protected  int beginIp65504P2208L;
            protected  int beginIp65504P2209S;
            protected  int beginIp65504P2209L;
            protected  int beginIp65504P2210S;
            protected  int beginIp65504P2210L;
            protected  int beginIp65504P2211S;
            protected  int beginIp65504P2211L;
            protected  int beginIp65504P2212S;
            protected  int beginIp65504P2212L;
            protected  int beginIp65504P2213S;
            protected  int beginIp65504P2213L;
            protected  int beginIp65504P2214S;
            protected  int beginIp65504P2214L;
            protected  int beginIp65504P2215S;
            protected  int beginIp65504P2215L;
            protected  int beginIp65504P2216S;
            protected  int beginIp65504P2216L;
            protected  int beginIp65504P2217S;
            protected  int beginIp65504P2217L;
            protected  int beginIp65504P2218S;
            protected  int beginIp65504P2218L;
            protected  int beginIp65504P2219S;
            protected  int beginIp65504P2219L;
            protected  int beginIp65504P2220S;
            protected  int beginIp65504P2220L;
            protected  int beginIp65504P2221S;
            protected  int beginIp65504P2221L;
            protected  int beginIp65504P2222S;
            protected  int beginIp65504P2222L;
            protected  int beginIp65504P2223S;
            protected  int beginIp65504P2223L;
            protected  int beginIp65504P2224S;
            protected  int beginIp65504P2224L;
            protected  int beginIp65504P2225S;
            protected  int beginIp65504P2225L;
            protected  int beginIp65504P2226S;
            protected  int beginIp65504P2226L;
            protected  int beginIp65504P2227S;
            protected  int beginIp65504P2227L;
            protected  int beginIp65504P2228S;
            protected  int beginIp65504P2228L;
            protected  int beginIp65504P2229S;
            protected  int beginIp65504P2229L;
            protected  int beginIp65504P2230S;
            protected  int beginIp65504P2230L;
            protected  int beginIp65504P2231S;
            protected  int beginIp65504P2231L;
            protected  int beginIp65504P2232S;
            protected  int beginIp65504P2232L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup72Serialized
	**/
    public Ip65504PdsNamesLargeGroup72Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup72Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup72Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup72Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17604); // serialize this field at offset 17604 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup72Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17604 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup72Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_72_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2202S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2202L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2203S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2203L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2204S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2204L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2205S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2205L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2206S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2206L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2207S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2207L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2208S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2208L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2209S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2209L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2210S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2210L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2211S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2211L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2212S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2212L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2213S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2213L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2214S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2214L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2215S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2215L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2216S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2216L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2217S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2217L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2218S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2218L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2219S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2219L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2220S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2220L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2221S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2221L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2222S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2222L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2223S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2223L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2224S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2224L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2225S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2225L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2226S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2226L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2227S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2227L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2228S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2228L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2229S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2229L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2230S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2230L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2231S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2231L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2232S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2232L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2202SCounter = -1;
         public boolean isIp65504P2202SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2202SCounter != sharedCounter;
            localIp65504P2202SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2202_S_LEN = 2;
  	/**
	 * serializeIp65504P2202S
	 */
	protected void serializeIp65504P2202S(short ip65504P2202S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2202S,IP_65504_P_2202_S_LEN)
                  ,beginIp65504P2202S
                  ,IP_65504_P_2202_S_LEN
                 );
            localIp65504P2202SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2202SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2202S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2202S() {	 
			return (getShort(beginIp65504P2202S));
   	}
         int localIp65504P2202LCounter = -1;
         public boolean isIp65504P2202LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2202LCounter != sharedCounter;
            localIp65504P2202LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2202_L_LEN = 2;
  	/**
	 * serializeIp65504P2202L
	 */
	protected void serializeIp65504P2202L(short ip65504P2202L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2202L,IP_65504_P_2202_L_LEN)
                  ,beginIp65504P2202L
                  ,IP_65504_P_2202_L_LEN
                 );
            localIp65504P2202LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2202LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2202L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2202L() {	 
			return (getShort(beginIp65504P2202L));
   	}
         int localIp65504P2203SCounter = -1;
         public boolean isIp65504P2203SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2203SCounter != sharedCounter;
            localIp65504P2203SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2203_S_LEN = 2;
  	/**
	 * serializeIp65504P2203S
	 */
	protected void serializeIp65504P2203S(short ip65504P2203S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2203S,IP_65504_P_2203_S_LEN)
                  ,beginIp65504P2203S
                  ,IP_65504_P_2203_S_LEN
                 );
            localIp65504P2203SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2203SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2203S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2203S() {	 
			return (getShort(beginIp65504P2203S));
   	}
         int localIp65504P2203LCounter = -1;
         public boolean isIp65504P2203LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2203LCounter != sharedCounter;
            localIp65504P2203LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2203_L_LEN = 2;
  	/**
	 * serializeIp65504P2203L
	 */
	protected void serializeIp65504P2203L(short ip65504P2203L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2203L,IP_65504_P_2203_L_LEN)
                  ,beginIp65504P2203L
                  ,IP_65504_P_2203_L_LEN
                 );
            localIp65504P2203LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2203LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2203L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2203L() {	 
			return (getShort(beginIp65504P2203L));
   	}
         int localIp65504P2204SCounter = -1;
         public boolean isIp65504P2204SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2204SCounter != sharedCounter;
            localIp65504P2204SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2204_S_LEN = 2;
  	/**
	 * serializeIp65504P2204S
	 */
	protected void serializeIp65504P2204S(short ip65504P2204S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2204S,IP_65504_P_2204_S_LEN)
                  ,beginIp65504P2204S
                  ,IP_65504_P_2204_S_LEN
                 );
            localIp65504P2204SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2204SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2204S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2204S() {	 
			return (getShort(beginIp65504P2204S));
   	}
         int localIp65504P2204LCounter = -1;
         public boolean isIp65504P2204LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2204LCounter != sharedCounter;
            localIp65504P2204LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2204_L_LEN = 2;
  	/**
	 * serializeIp65504P2204L
	 */
	protected void serializeIp65504P2204L(short ip65504P2204L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2204L,IP_65504_P_2204_L_LEN)
                  ,beginIp65504P2204L
                  ,IP_65504_P_2204_L_LEN
                 );
            localIp65504P2204LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2204LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2204L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2204L() {	 
			return (getShort(beginIp65504P2204L));
   	}
         int localIp65504P2205SCounter = -1;
         public boolean isIp65504P2205SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2205SCounter != sharedCounter;
            localIp65504P2205SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2205_S_LEN = 2;
  	/**
	 * serializeIp65504P2205S
	 */
	protected void serializeIp65504P2205S(short ip65504P2205S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2205S,IP_65504_P_2205_S_LEN)
                  ,beginIp65504P2205S
                  ,IP_65504_P_2205_S_LEN
                 );
            localIp65504P2205SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2205SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2205S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2205S() {	 
			return (getShort(beginIp65504P2205S));
   	}
         int localIp65504P2205LCounter = -1;
         public boolean isIp65504P2205LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2205LCounter != sharedCounter;
            localIp65504P2205LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2205_L_LEN = 2;
  	/**
	 * serializeIp65504P2205L
	 */
	protected void serializeIp65504P2205L(short ip65504P2205L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2205L,IP_65504_P_2205_L_LEN)
                  ,beginIp65504P2205L
                  ,IP_65504_P_2205_L_LEN
                 );
            localIp65504P2205LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2205LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2205L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2205L() {	 
			return (getShort(beginIp65504P2205L));
   	}
         int localIp65504P2206SCounter = -1;
         public boolean isIp65504P2206SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2206SCounter != sharedCounter;
            localIp65504P2206SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2206_S_LEN = 2;
  	/**
	 * serializeIp65504P2206S
	 */
	protected void serializeIp65504P2206S(short ip65504P2206S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2206S,IP_65504_P_2206_S_LEN)
                  ,beginIp65504P2206S
                  ,IP_65504_P_2206_S_LEN
                 );
            localIp65504P2206SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2206SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2206S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2206S() {	 
			return (getShort(beginIp65504P2206S));
   	}
         int localIp65504P2206LCounter = -1;
         public boolean isIp65504P2206LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2206LCounter != sharedCounter;
            localIp65504P2206LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2206_L_LEN = 2;
  	/**
	 * serializeIp65504P2206L
	 */
	protected void serializeIp65504P2206L(short ip65504P2206L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2206L,IP_65504_P_2206_L_LEN)
                  ,beginIp65504P2206L
                  ,IP_65504_P_2206_L_LEN
                 );
            localIp65504P2206LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2206LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2206L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2206L() {	 
			return (getShort(beginIp65504P2206L));
   	}
         int localIp65504P2207SCounter = -1;
         public boolean isIp65504P2207SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2207SCounter != sharedCounter;
            localIp65504P2207SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2207_S_LEN = 2;
  	/**
	 * serializeIp65504P2207S
	 */
	protected void serializeIp65504P2207S(short ip65504P2207S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2207S,IP_65504_P_2207_S_LEN)
                  ,beginIp65504P2207S
                  ,IP_65504_P_2207_S_LEN
                 );
            localIp65504P2207SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2207SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2207S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2207S() {	 
			return (getShort(beginIp65504P2207S));
   	}
         int localIp65504P2207LCounter = -1;
         public boolean isIp65504P2207LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2207LCounter != sharedCounter;
            localIp65504P2207LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2207_L_LEN = 2;
  	/**
	 * serializeIp65504P2207L
	 */
	protected void serializeIp65504P2207L(short ip65504P2207L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2207L,IP_65504_P_2207_L_LEN)
                  ,beginIp65504P2207L
                  ,IP_65504_P_2207_L_LEN
                 );
            localIp65504P2207LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2207LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2207L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2207L() {	 
			return (getShort(beginIp65504P2207L));
   	}
         int localIp65504P2208SCounter = -1;
         public boolean isIp65504P2208SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2208SCounter != sharedCounter;
            localIp65504P2208SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2208_S_LEN = 2;
  	/**
	 * serializeIp65504P2208S
	 */
	protected void serializeIp65504P2208S(short ip65504P2208S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2208S,IP_65504_P_2208_S_LEN)
                  ,beginIp65504P2208S
                  ,IP_65504_P_2208_S_LEN
                 );
            localIp65504P2208SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2208SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2208S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2208S() {	 
			return (getShort(beginIp65504P2208S));
   	}
         int localIp65504P2208LCounter = -1;
         public boolean isIp65504P2208LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2208LCounter != sharedCounter;
            localIp65504P2208LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2208_L_LEN = 2;
  	/**
	 * serializeIp65504P2208L
	 */
	protected void serializeIp65504P2208L(short ip65504P2208L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2208L,IP_65504_P_2208_L_LEN)
                  ,beginIp65504P2208L
                  ,IP_65504_P_2208_L_LEN
                 );
            localIp65504P2208LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2208LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2208L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2208L() {	 
			return (getShort(beginIp65504P2208L));
   	}
         int localIp65504P2209SCounter = -1;
         public boolean isIp65504P2209SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2209SCounter != sharedCounter;
            localIp65504P2209SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2209_S_LEN = 2;
  	/**
	 * serializeIp65504P2209S
	 */
	protected void serializeIp65504P2209S(short ip65504P2209S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2209S,IP_65504_P_2209_S_LEN)
                  ,beginIp65504P2209S
                  ,IP_65504_P_2209_S_LEN
                 );
            localIp65504P2209SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2209SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2209S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2209S() {	 
			return (getShort(beginIp65504P2209S));
   	}
         int localIp65504P2209LCounter = -1;
         public boolean isIp65504P2209LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2209LCounter != sharedCounter;
            localIp65504P2209LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2209_L_LEN = 2;
  	/**
	 * serializeIp65504P2209L
	 */
	protected void serializeIp65504P2209L(short ip65504P2209L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2209L,IP_65504_P_2209_L_LEN)
                  ,beginIp65504P2209L
                  ,IP_65504_P_2209_L_LEN
                 );
            localIp65504P2209LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2209LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2209L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2209L() {	 
			return (getShort(beginIp65504P2209L));
   	}
         int localIp65504P2210SCounter = -1;
         public boolean isIp65504P2210SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2210SCounter != sharedCounter;
            localIp65504P2210SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2210_S_LEN = 2;
  	/**
	 * serializeIp65504P2210S
	 */
	protected void serializeIp65504P2210S(short ip65504P2210S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2210S,IP_65504_P_2210_S_LEN)
                  ,beginIp65504P2210S
                  ,IP_65504_P_2210_S_LEN
                 );
            localIp65504P2210SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2210SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2210S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2210S() {	 
			return (getShort(beginIp65504P2210S));
   	}
         int localIp65504P2210LCounter = -1;
         public boolean isIp65504P2210LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2210LCounter != sharedCounter;
            localIp65504P2210LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2210_L_LEN = 2;
  	/**
	 * serializeIp65504P2210L
	 */
	protected void serializeIp65504P2210L(short ip65504P2210L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2210L,IP_65504_P_2210_L_LEN)
                  ,beginIp65504P2210L
                  ,IP_65504_P_2210_L_LEN
                 );
            localIp65504P2210LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2210LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2210L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2210L() {	 
			return (getShort(beginIp65504P2210L));
   	}
         int localIp65504P2211SCounter = -1;
         public boolean isIp65504P2211SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2211SCounter != sharedCounter;
            localIp65504P2211SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2211_S_LEN = 2;
  	/**
	 * serializeIp65504P2211S
	 */
	protected void serializeIp65504P2211S(short ip65504P2211S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2211S,IP_65504_P_2211_S_LEN)
                  ,beginIp65504P2211S
                  ,IP_65504_P_2211_S_LEN
                 );
            localIp65504P2211SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2211SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2211S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2211S() {	 
			return (getShort(beginIp65504P2211S));
   	}
         int localIp65504P2211LCounter = -1;
         public boolean isIp65504P2211LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2211LCounter != sharedCounter;
            localIp65504P2211LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2211_L_LEN = 2;
  	/**
	 * serializeIp65504P2211L
	 */
	protected void serializeIp65504P2211L(short ip65504P2211L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2211L,IP_65504_P_2211_L_LEN)
                  ,beginIp65504P2211L
                  ,IP_65504_P_2211_L_LEN
                 );
            localIp65504P2211LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2211LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2211L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2211L() {	 
			return (getShort(beginIp65504P2211L));
   	}
         int localIp65504P2212SCounter = -1;
         public boolean isIp65504P2212SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2212SCounter != sharedCounter;
            localIp65504P2212SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2212_S_LEN = 2;
  	/**
	 * serializeIp65504P2212S
	 */
	protected void serializeIp65504P2212S(short ip65504P2212S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2212S,IP_65504_P_2212_S_LEN)
                  ,beginIp65504P2212S
                  ,IP_65504_P_2212_S_LEN
                 );
            localIp65504P2212SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2212SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2212S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2212S() {	 
			return (getShort(beginIp65504P2212S));
   	}
         int localIp65504P2212LCounter = -1;
         public boolean isIp65504P2212LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2212LCounter != sharedCounter;
            localIp65504P2212LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2212_L_LEN = 2;
  	/**
	 * serializeIp65504P2212L
	 */
	protected void serializeIp65504P2212L(short ip65504P2212L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2212L,IP_65504_P_2212_L_LEN)
                  ,beginIp65504P2212L
                  ,IP_65504_P_2212_L_LEN
                 );
            localIp65504P2212LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2212LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2212L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2212L() {	 
			return (getShort(beginIp65504P2212L));
   	}
         int localIp65504P2213SCounter = -1;
         public boolean isIp65504P2213SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2213SCounter != sharedCounter;
            localIp65504P2213SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2213_S_LEN = 2;
  	/**
	 * serializeIp65504P2213S
	 */
	protected void serializeIp65504P2213S(short ip65504P2213S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2213S,IP_65504_P_2213_S_LEN)
                  ,beginIp65504P2213S
                  ,IP_65504_P_2213_S_LEN
                 );
            localIp65504P2213SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2213SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2213S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2213S() {	 
			return (getShort(beginIp65504P2213S));
   	}
         int localIp65504P2213LCounter = -1;
         public boolean isIp65504P2213LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2213LCounter != sharedCounter;
            localIp65504P2213LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2213_L_LEN = 2;
  	/**
	 * serializeIp65504P2213L
	 */
	protected void serializeIp65504P2213L(short ip65504P2213L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2213L,IP_65504_P_2213_L_LEN)
                  ,beginIp65504P2213L
                  ,IP_65504_P_2213_L_LEN
                 );
            localIp65504P2213LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2213LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2213L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2213L() {	 
			return (getShort(beginIp65504P2213L));
   	}
         int localIp65504P2214SCounter = -1;
         public boolean isIp65504P2214SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2214SCounter != sharedCounter;
            localIp65504P2214SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2214_S_LEN = 2;
  	/**
	 * serializeIp65504P2214S
	 */
	protected void serializeIp65504P2214S(short ip65504P2214S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2214S,IP_65504_P_2214_S_LEN)
                  ,beginIp65504P2214S
                  ,IP_65504_P_2214_S_LEN
                 );
            localIp65504P2214SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2214SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2214S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2214S() {	 
			return (getShort(beginIp65504P2214S));
   	}
         int localIp65504P2214LCounter = -1;
         public boolean isIp65504P2214LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2214LCounter != sharedCounter;
            localIp65504P2214LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2214_L_LEN = 2;
  	/**
	 * serializeIp65504P2214L
	 */
	protected void serializeIp65504P2214L(short ip65504P2214L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2214L,IP_65504_P_2214_L_LEN)
                  ,beginIp65504P2214L
                  ,IP_65504_P_2214_L_LEN
                 );
            localIp65504P2214LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2214LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2214L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2214L() {	 
			return (getShort(beginIp65504P2214L));
   	}
         int localIp65504P2215SCounter = -1;
         public boolean isIp65504P2215SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2215SCounter != sharedCounter;
            localIp65504P2215SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2215_S_LEN = 2;
  	/**
	 * serializeIp65504P2215S
	 */
	protected void serializeIp65504P2215S(short ip65504P2215S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2215S,IP_65504_P_2215_S_LEN)
                  ,beginIp65504P2215S
                  ,IP_65504_P_2215_S_LEN
                 );
            localIp65504P2215SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2215SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2215S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2215S() {	 
			return (getShort(beginIp65504P2215S));
   	}
         int localIp65504P2215LCounter = -1;
         public boolean isIp65504P2215LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2215LCounter != sharedCounter;
            localIp65504P2215LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2215_L_LEN = 2;
  	/**
	 * serializeIp65504P2215L
	 */
	protected void serializeIp65504P2215L(short ip65504P2215L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2215L,IP_65504_P_2215_L_LEN)
                  ,beginIp65504P2215L
                  ,IP_65504_P_2215_L_LEN
                 );
            localIp65504P2215LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2215LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2215L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2215L() {	 
			return (getShort(beginIp65504P2215L));
   	}
         int localIp65504P2216SCounter = -1;
         public boolean isIp65504P2216SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2216SCounter != sharedCounter;
            localIp65504P2216SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2216_S_LEN = 2;
  	/**
	 * serializeIp65504P2216S
	 */
	protected void serializeIp65504P2216S(short ip65504P2216S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2216S,IP_65504_P_2216_S_LEN)
                  ,beginIp65504P2216S
                  ,IP_65504_P_2216_S_LEN
                 );
            localIp65504P2216SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2216SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2216S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2216S() {	 
			return (getShort(beginIp65504P2216S));
   	}
         int localIp65504P2216LCounter = -1;
         public boolean isIp65504P2216LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2216LCounter != sharedCounter;
            localIp65504P2216LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2216_L_LEN = 2;
  	/**
	 * serializeIp65504P2216L
	 */
	protected void serializeIp65504P2216L(short ip65504P2216L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2216L,IP_65504_P_2216_L_LEN)
                  ,beginIp65504P2216L
                  ,IP_65504_P_2216_L_LEN
                 );
            localIp65504P2216LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2216LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2216L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2216L() {	 
			return (getShort(beginIp65504P2216L));
   	}
         int localIp65504P2217SCounter = -1;
         public boolean isIp65504P2217SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2217SCounter != sharedCounter;
            localIp65504P2217SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2217_S_LEN = 2;
  	/**
	 * serializeIp65504P2217S
	 */
	protected void serializeIp65504P2217S(short ip65504P2217S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2217S,IP_65504_P_2217_S_LEN)
                  ,beginIp65504P2217S
                  ,IP_65504_P_2217_S_LEN
                 );
            localIp65504P2217SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2217SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2217S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2217S() {	 
			return (getShort(beginIp65504P2217S));
   	}
         int localIp65504P2217LCounter = -1;
         public boolean isIp65504P2217LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2217LCounter != sharedCounter;
            localIp65504P2217LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2217_L_LEN = 2;
  	/**
	 * serializeIp65504P2217L
	 */
	protected void serializeIp65504P2217L(short ip65504P2217L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2217L,IP_65504_P_2217_L_LEN)
                  ,beginIp65504P2217L
                  ,IP_65504_P_2217_L_LEN
                 );
            localIp65504P2217LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2217LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2217L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2217L() {	 
			return (getShort(beginIp65504P2217L));
   	}
         int localIp65504P2218SCounter = -1;
         public boolean isIp65504P2218SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2218SCounter != sharedCounter;
            localIp65504P2218SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2218_S_LEN = 2;
  	/**
	 * serializeIp65504P2218S
	 */
	protected void serializeIp65504P2218S(short ip65504P2218S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2218S,IP_65504_P_2218_S_LEN)
                  ,beginIp65504P2218S
                  ,IP_65504_P_2218_S_LEN
                 );
            localIp65504P2218SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2218SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2218S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2218S() {	 
			return (getShort(beginIp65504P2218S));
   	}
         int localIp65504P2218LCounter = -1;
         public boolean isIp65504P2218LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2218LCounter != sharedCounter;
            localIp65504P2218LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2218_L_LEN = 2;
  	/**
	 * serializeIp65504P2218L
	 */
	protected void serializeIp65504P2218L(short ip65504P2218L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2218L,IP_65504_P_2218_L_LEN)
                  ,beginIp65504P2218L
                  ,IP_65504_P_2218_L_LEN
                 );
            localIp65504P2218LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2218LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2218L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2218L() {	 
			return (getShort(beginIp65504P2218L));
   	}
         int localIp65504P2219SCounter = -1;
         public boolean isIp65504P2219SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2219SCounter != sharedCounter;
            localIp65504P2219SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2219_S_LEN = 2;
  	/**
	 * serializeIp65504P2219S
	 */
	protected void serializeIp65504P2219S(short ip65504P2219S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2219S,IP_65504_P_2219_S_LEN)
                  ,beginIp65504P2219S
                  ,IP_65504_P_2219_S_LEN
                 );
            localIp65504P2219SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2219SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2219S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2219S() {	 
			return (getShort(beginIp65504P2219S));
   	}
         int localIp65504P2219LCounter = -1;
         public boolean isIp65504P2219LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2219LCounter != sharedCounter;
            localIp65504P2219LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2219_L_LEN = 2;
  	/**
	 * serializeIp65504P2219L
	 */
	protected void serializeIp65504P2219L(short ip65504P2219L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2219L,IP_65504_P_2219_L_LEN)
                  ,beginIp65504P2219L
                  ,IP_65504_P_2219_L_LEN
                 );
            localIp65504P2219LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2219LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2219L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2219L() {	 
			return (getShort(beginIp65504P2219L));
   	}
         int localIp65504P2220SCounter = -1;
         public boolean isIp65504P2220SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2220SCounter != sharedCounter;
            localIp65504P2220SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2220_S_LEN = 2;
  	/**
	 * serializeIp65504P2220S
	 */
	protected void serializeIp65504P2220S(short ip65504P2220S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2220S,IP_65504_P_2220_S_LEN)
                  ,beginIp65504P2220S
                  ,IP_65504_P_2220_S_LEN
                 );
            localIp65504P2220SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2220SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2220S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2220S() {	 
			return (getShort(beginIp65504P2220S));
   	}
         int localIp65504P2220LCounter = -1;
         public boolean isIp65504P2220LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2220LCounter != sharedCounter;
            localIp65504P2220LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2220_L_LEN = 2;
  	/**
	 * serializeIp65504P2220L
	 */
	protected void serializeIp65504P2220L(short ip65504P2220L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2220L,IP_65504_P_2220_L_LEN)
                  ,beginIp65504P2220L
                  ,IP_65504_P_2220_L_LEN
                 );
            localIp65504P2220LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2220LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2220L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2220L() {	 
			return (getShort(beginIp65504P2220L));
   	}
         int localIp65504P2221SCounter = -1;
         public boolean isIp65504P2221SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2221SCounter != sharedCounter;
            localIp65504P2221SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2221_S_LEN = 2;
  	/**
	 * serializeIp65504P2221S
	 */
	protected void serializeIp65504P2221S(short ip65504P2221S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2221S,IP_65504_P_2221_S_LEN)
                  ,beginIp65504P2221S
                  ,IP_65504_P_2221_S_LEN
                 );
            localIp65504P2221SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2221SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2221S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2221S() {	 
			return (getShort(beginIp65504P2221S));
   	}
         int localIp65504P2221LCounter = -1;
         public boolean isIp65504P2221LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2221LCounter != sharedCounter;
            localIp65504P2221LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2221_L_LEN = 2;
  	/**
	 * serializeIp65504P2221L
	 */
	protected void serializeIp65504P2221L(short ip65504P2221L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2221L,IP_65504_P_2221_L_LEN)
                  ,beginIp65504P2221L
                  ,IP_65504_P_2221_L_LEN
                 );
            localIp65504P2221LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2221LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2221L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2221L() {	 
			return (getShort(beginIp65504P2221L));
   	}
         int localIp65504P2222SCounter = -1;
         public boolean isIp65504P2222SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2222SCounter != sharedCounter;
            localIp65504P2222SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2222_S_LEN = 2;
  	/**
	 * serializeIp65504P2222S
	 */
	protected void serializeIp65504P2222S(short ip65504P2222S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2222S,IP_65504_P_2222_S_LEN)
                  ,beginIp65504P2222S
                  ,IP_65504_P_2222_S_LEN
                 );
            localIp65504P2222SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2222SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2222S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2222S() {	 
			return (getShort(beginIp65504P2222S));
   	}
         int localIp65504P2222LCounter = -1;
         public boolean isIp65504P2222LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2222LCounter != sharedCounter;
            localIp65504P2222LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2222_L_LEN = 2;
  	/**
	 * serializeIp65504P2222L
	 */
	protected void serializeIp65504P2222L(short ip65504P2222L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2222L,IP_65504_P_2222_L_LEN)
                  ,beginIp65504P2222L
                  ,IP_65504_P_2222_L_LEN
                 );
            localIp65504P2222LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2222LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2222L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2222L() {	 
			return (getShort(beginIp65504P2222L));
   	}
         int localIp65504P2223SCounter = -1;
         public boolean isIp65504P2223SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2223SCounter != sharedCounter;
            localIp65504P2223SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2223_S_LEN = 2;
  	/**
	 * serializeIp65504P2223S
	 */
	protected void serializeIp65504P2223S(short ip65504P2223S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2223S,IP_65504_P_2223_S_LEN)
                  ,beginIp65504P2223S
                  ,IP_65504_P_2223_S_LEN
                 );
            localIp65504P2223SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2223SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2223S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2223S() {	 
			return (getShort(beginIp65504P2223S));
   	}
         int localIp65504P2223LCounter = -1;
         public boolean isIp65504P2223LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2223LCounter != sharedCounter;
            localIp65504P2223LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2223_L_LEN = 2;
  	/**
	 * serializeIp65504P2223L
	 */
	protected void serializeIp65504P2223L(short ip65504P2223L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2223L,IP_65504_P_2223_L_LEN)
                  ,beginIp65504P2223L
                  ,IP_65504_P_2223_L_LEN
                 );
            localIp65504P2223LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2223LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2223L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2223L() {	 
			return (getShort(beginIp65504P2223L));
   	}
         int localIp65504P2224SCounter = -1;
         public boolean isIp65504P2224SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2224SCounter != sharedCounter;
            localIp65504P2224SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2224_S_LEN = 2;
  	/**
	 * serializeIp65504P2224S
	 */
	protected void serializeIp65504P2224S(short ip65504P2224S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2224S,IP_65504_P_2224_S_LEN)
                  ,beginIp65504P2224S
                  ,IP_65504_P_2224_S_LEN
                 );
            localIp65504P2224SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2224SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2224S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2224S() {	 
			return (getShort(beginIp65504P2224S));
   	}
         int localIp65504P2224LCounter = -1;
         public boolean isIp65504P2224LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2224LCounter != sharedCounter;
            localIp65504P2224LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2224_L_LEN = 2;
  	/**
	 * serializeIp65504P2224L
	 */
	protected void serializeIp65504P2224L(short ip65504P2224L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2224L,IP_65504_P_2224_L_LEN)
                  ,beginIp65504P2224L
                  ,IP_65504_P_2224_L_LEN
                 );
            localIp65504P2224LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2224LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2224L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2224L() {	 
			return (getShort(beginIp65504P2224L));
   	}
         int localIp65504P2225SCounter = -1;
         public boolean isIp65504P2225SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2225SCounter != sharedCounter;
            localIp65504P2225SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2225_S_LEN = 2;
  	/**
	 * serializeIp65504P2225S
	 */
	protected void serializeIp65504P2225S(short ip65504P2225S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2225S,IP_65504_P_2225_S_LEN)
                  ,beginIp65504P2225S
                  ,IP_65504_P_2225_S_LEN
                 );
            localIp65504P2225SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2225SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2225S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2225S() {	 
			return (getShort(beginIp65504P2225S));
   	}
         int localIp65504P2225LCounter = -1;
         public boolean isIp65504P2225LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2225LCounter != sharedCounter;
            localIp65504P2225LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2225_L_LEN = 2;
  	/**
	 * serializeIp65504P2225L
	 */
	protected void serializeIp65504P2225L(short ip65504P2225L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2225L,IP_65504_P_2225_L_LEN)
                  ,beginIp65504P2225L
                  ,IP_65504_P_2225_L_LEN
                 );
            localIp65504P2225LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2225LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2225L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2225L() {	 
			return (getShort(beginIp65504P2225L));
   	}
         int localIp65504P2226SCounter = -1;
         public boolean isIp65504P2226SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2226SCounter != sharedCounter;
            localIp65504P2226SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2226_S_LEN = 2;
  	/**
	 * serializeIp65504P2226S
	 */
	protected void serializeIp65504P2226S(short ip65504P2226S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2226S,IP_65504_P_2226_S_LEN)
                  ,beginIp65504P2226S
                  ,IP_65504_P_2226_S_LEN
                 );
            localIp65504P2226SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2226SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2226S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2226S() {	 
			return (getShort(beginIp65504P2226S));
   	}
         int localIp65504P2226LCounter = -1;
         public boolean isIp65504P2226LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2226LCounter != sharedCounter;
            localIp65504P2226LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2226_L_LEN = 2;
  	/**
	 * serializeIp65504P2226L
	 */
	protected void serializeIp65504P2226L(short ip65504P2226L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2226L,IP_65504_P_2226_L_LEN)
                  ,beginIp65504P2226L
                  ,IP_65504_P_2226_L_LEN
                 );
            localIp65504P2226LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2226LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2226L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2226L() {	 
			return (getShort(beginIp65504P2226L));
   	}
         int localIp65504P2227SCounter = -1;
         public boolean isIp65504P2227SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2227SCounter != sharedCounter;
            localIp65504P2227SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2227_S_LEN = 2;
  	/**
	 * serializeIp65504P2227S
	 */
	protected void serializeIp65504P2227S(short ip65504P2227S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2227S,IP_65504_P_2227_S_LEN)
                  ,beginIp65504P2227S
                  ,IP_65504_P_2227_S_LEN
                 );
            localIp65504P2227SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2227SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2227S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2227S() {	 
			return (getShort(beginIp65504P2227S));
   	}
         int localIp65504P2227LCounter = -1;
         public boolean isIp65504P2227LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2227LCounter != sharedCounter;
            localIp65504P2227LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2227_L_LEN = 2;
  	/**
	 * serializeIp65504P2227L
	 */
	protected void serializeIp65504P2227L(short ip65504P2227L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2227L,IP_65504_P_2227_L_LEN)
                  ,beginIp65504P2227L
                  ,IP_65504_P_2227_L_LEN
                 );
            localIp65504P2227LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2227LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2227L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2227L() {	 
			return (getShort(beginIp65504P2227L));
   	}
         int localIp65504P2228SCounter = -1;
         public boolean isIp65504P2228SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2228SCounter != sharedCounter;
            localIp65504P2228SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2228_S_LEN = 2;
  	/**
	 * serializeIp65504P2228S
	 */
	protected void serializeIp65504P2228S(short ip65504P2228S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2228S,IP_65504_P_2228_S_LEN)
                  ,beginIp65504P2228S
                  ,IP_65504_P_2228_S_LEN
                 );
            localIp65504P2228SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2228SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2228S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2228S() {	 
			return (getShort(beginIp65504P2228S));
   	}
         int localIp65504P2228LCounter = -1;
         public boolean isIp65504P2228LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2228LCounter != sharedCounter;
            localIp65504P2228LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2228_L_LEN = 2;
  	/**
	 * serializeIp65504P2228L
	 */
	protected void serializeIp65504P2228L(short ip65504P2228L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2228L,IP_65504_P_2228_L_LEN)
                  ,beginIp65504P2228L
                  ,IP_65504_P_2228_L_LEN
                 );
            localIp65504P2228LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2228LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2228L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2228L() {	 
			return (getShort(beginIp65504P2228L));
   	}
         int localIp65504P2229SCounter = -1;
         public boolean isIp65504P2229SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2229SCounter != sharedCounter;
            localIp65504P2229SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2229_S_LEN = 2;
  	/**
	 * serializeIp65504P2229S
	 */
	protected void serializeIp65504P2229S(short ip65504P2229S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2229S,IP_65504_P_2229_S_LEN)
                  ,beginIp65504P2229S
                  ,IP_65504_P_2229_S_LEN
                 );
            localIp65504P2229SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2229SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2229S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2229S() {	 
			return (getShort(beginIp65504P2229S));
   	}
         int localIp65504P2229LCounter = -1;
         public boolean isIp65504P2229LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2229LCounter != sharedCounter;
            localIp65504P2229LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2229_L_LEN = 2;
  	/**
	 * serializeIp65504P2229L
	 */
	protected void serializeIp65504P2229L(short ip65504P2229L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2229L,IP_65504_P_2229_L_LEN)
                  ,beginIp65504P2229L
                  ,IP_65504_P_2229_L_LEN
                 );
            localIp65504P2229LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2229LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2229L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2229L() {	 
			return (getShort(beginIp65504P2229L));
   	}
         int localIp65504P2230SCounter = -1;
         public boolean isIp65504P2230SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2230SCounter != sharedCounter;
            localIp65504P2230SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2230_S_LEN = 2;
  	/**
	 * serializeIp65504P2230S
	 */
	protected void serializeIp65504P2230S(short ip65504P2230S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2230S,IP_65504_P_2230_S_LEN)
                  ,beginIp65504P2230S
                  ,IP_65504_P_2230_S_LEN
                 );
            localIp65504P2230SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2230SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2230S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2230S() {	 
			return (getShort(beginIp65504P2230S));
   	}
         int localIp65504P2230LCounter = -1;
         public boolean isIp65504P2230LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2230LCounter != sharedCounter;
            localIp65504P2230LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2230_L_LEN = 2;
  	/**
	 * serializeIp65504P2230L
	 */
	protected void serializeIp65504P2230L(short ip65504P2230L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2230L,IP_65504_P_2230_L_LEN)
                  ,beginIp65504P2230L
                  ,IP_65504_P_2230_L_LEN
                 );
            localIp65504P2230LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2230LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2230L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2230L() {	 
			return (getShort(beginIp65504P2230L));
   	}
         int localIp65504P2231SCounter = -1;
         public boolean isIp65504P2231SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2231SCounter != sharedCounter;
            localIp65504P2231SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2231_S_LEN = 2;
  	/**
	 * serializeIp65504P2231S
	 */
	protected void serializeIp65504P2231S(short ip65504P2231S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2231S,IP_65504_P_2231_S_LEN)
                  ,beginIp65504P2231S
                  ,IP_65504_P_2231_S_LEN
                 );
            localIp65504P2231SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2231SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2231S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2231S() {	 
			return (getShort(beginIp65504P2231S));
   	}
         int localIp65504P2231LCounter = -1;
         public boolean isIp65504P2231LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2231LCounter != sharedCounter;
            localIp65504P2231LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2231_L_LEN = 2;
  	/**
	 * serializeIp65504P2231L
	 */
	protected void serializeIp65504P2231L(short ip65504P2231L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2231L,IP_65504_P_2231_L_LEN)
                  ,beginIp65504P2231L
                  ,IP_65504_P_2231_L_LEN
                 );
            localIp65504P2231LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2231LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2231L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2231L() {	 
			return (getShort(beginIp65504P2231L));
   	}
         int localIp65504P2232SCounter = -1;
         public boolean isIp65504P2232SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2232SCounter != sharedCounter;
            localIp65504P2232SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2232_S_LEN = 2;
  	/**
	 * serializeIp65504P2232S
	 */
	protected void serializeIp65504P2232S(short ip65504P2232S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2232S,IP_65504_P_2232_S_LEN)
                  ,beginIp65504P2232S
                  ,IP_65504_P_2232_S_LEN
                 );
            localIp65504P2232SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2232SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2232S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2232S() {	 
			return (getShort(beginIp65504P2232S));
   	}
         int localIp65504P2232LCounter = -1;
         public boolean isIp65504P2232LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2232LCounter != sharedCounter;
            localIp65504P2232LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2232_L_LEN = 2;
  	/**
	 * serializeIp65504P2232L
	 */
	protected void serializeIp65504P2232L(short ip65504P2232L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2232L,IP_65504_P_2232_L_LEN)
                  ,beginIp65504P2232L
                  ,IP_65504_P_2232_L_LEN
                 );
            localIp65504P2232LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2232LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2232L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2232L() {	 
			return (getShort(beginIp65504P2232L));
   	}




}
  
