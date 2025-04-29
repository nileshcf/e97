package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup69Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup69Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup69Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_69_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2109S;
            protected  int beginIp65504P2109L;
            protected  int beginIp65504P2110S;
            protected  int beginIp65504P2110L;
            protected  int beginIp65504P2111S;
            protected  int beginIp65504P2111L;
            protected  int beginIp65504P2112S;
            protected  int beginIp65504P2112L;
            protected  int beginIp65504P2113S;
            protected  int beginIp65504P2113L;
            protected  int beginIp65504P2114S;
            protected  int beginIp65504P2114L;
            protected  int beginIp65504P2115S;
            protected  int beginIp65504P2115L;
            protected  int beginIp65504P2116S;
            protected  int beginIp65504P2116L;
            protected  int beginIp65504P2117S;
            protected  int beginIp65504P2117L;
            protected  int beginIp65504P2118S;
            protected  int beginIp65504P2118L;
            protected  int beginIp65504P2119S;
            protected  int beginIp65504P2119L;
            protected  int beginIp65504P2120S;
            protected  int beginIp65504P2120L;
            protected  int beginIp65504P2121S;
            protected  int beginIp65504P2121L;
            protected  int beginIp65504P2122S;
            protected  int beginIp65504P2122L;
            protected  int beginIp65504P2123S;
            protected  int beginIp65504P2123L;
            protected  int beginIp65504P2124S;
            protected  int beginIp65504P2124L;
            protected  int beginIp65504P2125S;
            protected  int beginIp65504P2125L;
            protected  int beginIp65504P2126S;
            protected  int beginIp65504P2126L;
            protected  int beginIp65504P2127S;
            protected  int beginIp65504P2127L;
            protected  int beginIp65504P2128S;
            protected  int beginIp65504P2128L;
            protected  int beginIp65504P2129S;
            protected  int beginIp65504P2129L;
            protected  int beginIp65504P2130S;
            protected  int beginIp65504P2130L;
            protected  int beginIp65504P2131S;
            protected  int beginIp65504P2131L;
            protected  int beginIp65504P2132S;
            protected  int beginIp65504P2132L;
            protected  int beginIp65504P2133S;
            protected  int beginIp65504P2133L;
            protected  int beginIp65504P2134S;
            protected  int beginIp65504P2134L;
            protected  int beginIp65504P2135S;
            protected  int beginIp65504P2135L;
            protected  int beginIp65504P2136S;
            protected  int beginIp65504P2136L;
            protected  int beginIp65504P2137S;
            protected  int beginIp65504P2137L;
            protected  int beginIp65504P2138S;
            protected  int beginIp65504P2138L;
            protected  int beginIp65504P2139S;
            protected  int beginIp65504P2139L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup69Serialized
	**/
    public Ip65504PdsNamesLargeGroup69Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup69Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup69Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup69Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16860); // serialize this field at offset 16860 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup69Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16860 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup69Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_69_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2109S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2109L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2110S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2110L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2111S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2111L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2112S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2112L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2113S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2113L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2114S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2114L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2115S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2115L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2116S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2116L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2117S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2117L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2118S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2118L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2119S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2119L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2120S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2120L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2121S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2121L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2122S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2122L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2123S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2123L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2124S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2124L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2125S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2125L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2126S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2126L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2127S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2127L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2128S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2128L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2129S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2129L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2130S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2130L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2131S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2131L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2132S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2132L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2133S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2133L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2134S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2134L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2135S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2135L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2136S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2136L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2137S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2137L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2138S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2138L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2139S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2139L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2109SCounter = -1;
         public boolean isIp65504P2109SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2109SCounter != sharedCounter;
            localIp65504P2109SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2109_S_LEN = 2;
  	/**
	 * serializeIp65504P2109S
	 */
	protected void serializeIp65504P2109S(short ip65504P2109S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2109S,IP_65504_P_2109_S_LEN)
                  ,beginIp65504P2109S
                  ,IP_65504_P_2109_S_LEN
                 );
            localIp65504P2109SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2109SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2109S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2109S() {	 
			return (getShort(beginIp65504P2109S));
   	}
         int localIp65504P2109LCounter = -1;
         public boolean isIp65504P2109LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2109LCounter != sharedCounter;
            localIp65504P2109LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2109_L_LEN = 2;
  	/**
	 * serializeIp65504P2109L
	 */
	protected void serializeIp65504P2109L(short ip65504P2109L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2109L,IP_65504_P_2109_L_LEN)
                  ,beginIp65504P2109L
                  ,IP_65504_P_2109_L_LEN
                 );
            localIp65504P2109LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2109LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2109L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2109L() {	 
			return (getShort(beginIp65504P2109L));
   	}
         int localIp65504P2110SCounter = -1;
         public boolean isIp65504P2110SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2110SCounter != sharedCounter;
            localIp65504P2110SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2110_S_LEN = 2;
  	/**
	 * serializeIp65504P2110S
	 */
	protected void serializeIp65504P2110S(short ip65504P2110S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2110S,IP_65504_P_2110_S_LEN)
                  ,beginIp65504P2110S
                  ,IP_65504_P_2110_S_LEN
                 );
            localIp65504P2110SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2110SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2110S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2110S() {	 
			return (getShort(beginIp65504P2110S));
   	}
         int localIp65504P2110LCounter = -1;
         public boolean isIp65504P2110LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2110LCounter != sharedCounter;
            localIp65504P2110LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2110_L_LEN = 2;
  	/**
	 * serializeIp65504P2110L
	 */
	protected void serializeIp65504P2110L(short ip65504P2110L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2110L,IP_65504_P_2110_L_LEN)
                  ,beginIp65504P2110L
                  ,IP_65504_P_2110_L_LEN
                 );
            localIp65504P2110LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2110LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2110L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2110L() {	 
			return (getShort(beginIp65504P2110L));
   	}
         int localIp65504P2111SCounter = -1;
         public boolean isIp65504P2111SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2111SCounter != sharedCounter;
            localIp65504P2111SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2111_S_LEN = 2;
  	/**
	 * serializeIp65504P2111S
	 */
	protected void serializeIp65504P2111S(short ip65504P2111S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2111S,IP_65504_P_2111_S_LEN)
                  ,beginIp65504P2111S
                  ,IP_65504_P_2111_S_LEN
                 );
            localIp65504P2111SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2111SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2111S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2111S() {	 
			return (getShort(beginIp65504P2111S));
   	}
         int localIp65504P2111LCounter = -1;
         public boolean isIp65504P2111LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2111LCounter != sharedCounter;
            localIp65504P2111LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2111_L_LEN = 2;
  	/**
	 * serializeIp65504P2111L
	 */
	protected void serializeIp65504P2111L(short ip65504P2111L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2111L,IP_65504_P_2111_L_LEN)
                  ,beginIp65504P2111L
                  ,IP_65504_P_2111_L_LEN
                 );
            localIp65504P2111LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2111LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2111L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2111L() {	 
			return (getShort(beginIp65504P2111L));
   	}
         int localIp65504P2112SCounter = -1;
         public boolean isIp65504P2112SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2112SCounter != sharedCounter;
            localIp65504P2112SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2112_S_LEN = 2;
  	/**
	 * serializeIp65504P2112S
	 */
	protected void serializeIp65504P2112S(short ip65504P2112S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2112S,IP_65504_P_2112_S_LEN)
                  ,beginIp65504P2112S
                  ,IP_65504_P_2112_S_LEN
                 );
            localIp65504P2112SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2112SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2112S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2112S() {	 
			return (getShort(beginIp65504P2112S));
   	}
         int localIp65504P2112LCounter = -1;
         public boolean isIp65504P2112LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2112LCounter != sharedCounter;
            localIp65504P2112LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2112_L_LEN = 2;
  	/**
	 * serializeIp65504P2112L
	 */
	protected void serializeIp65504P2112L(short ip65504P2112L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2112L,IP_65504_P_2112_L_LEN)
                  ,beginIp65504P2112L
                  ,IP_65504_P_2112_L_LEN
                 );
            localIp65504P2112LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2112LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2112L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2112L() {	 
			return (getShort(beginIp65504P2112L));
   	}
         int localIp65504P2113SCounter = -1;
         public boolean isIp65504P2113SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2113SCounter != sharedCounter;
            localIp65504P2113SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2113_S_LEN = 2;
  	/**
	 * serializeIp65504P2113S
	 */
	protected void serializeIp65504P2113S(short ip65504P2113S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2113S,IP_65504_P_2113_S_LEN)
                  ,beginIp65504P2113S
                  ,IP_65504_P_2113_S_LEN
                 );
            localIp65504P2113SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2113SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2113S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2113S() {	 
			return (getShort(beginIp65504P2113S));
   	}
         int localIp65504P2113LCounter = -1;
         public boolean isIp65504P2113LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2113LCounter != sharedCounter;
            localIp65504P2113LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2113_L_LEN = 2;
  	/**
	 * serializeIp65504P2113L
	 */
	protected void serializeIp65504P2113L(short ip65504P2113L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2113L,IP_65504_P_2113_L_LEN)
                  ,beginIp65504P2113L
                  ,IP_65504_P_2113_L_LEN
                 );
            localIp65504P2113LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2113LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2113L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2113L() {	 
			return (getShort(beginIp65504P2113L));
   	}
         int localIp65504P2114SCounter = -1;
         public boolean isIp65504P2114SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2114SCounter != sharedCounter;
            localIp65504P2114SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2114_S_LEN = 2;
  	/**
	 * serializeIp65504P2114S
	 */
	protected void serializeIp65504P2114S(short ip65504P2114S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2114S,IP_65504_P_2114_S_LEN)
                  ,beginIp65504P2114S
                  ,IP_65504_P_2114_S_LEN
                 );
            localIp65504P2114SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2114SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2114S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2114S() {	 
			return (getShort(beginIp65504P2114S));
   	}
         int localIp65504P2114LCounter = -1;
         public boolean isIp65504P2114LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2114LCounter != sharedCounter;
            localIp65504P2114LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2114_L_LEN = 2;
  	/**
	 * serializeIp65504P2114L
	 */
	protected void serializeIp65504P2114L(short ip65504P2114L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2114L,IP_65504_P_2114_L_LEN)
                  ,beginIp65504P2114L
                  ,IP_65504_P_2114_L_LEN
                 );
            localIp65504P2114LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2114LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2114L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2114L() {	 
			return (getShort(beginIp65504P2114L));
   	}
         int localIp65504P2115SCounter = -1;
         public boolean isIp65504P2115SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2115SCounter != sharedCounter;
            localIp65504P2115SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2115_S_LEN = 2;
  	/**
	 * serializeIp65504P2115S
	 */
	protected void serializeIp65504P2115S(short ip65504P2115S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2115S,IP_65504_P_2115_S_LEN)
                  ,beginIp65504P2115S
                  ,IP_65504_P_2115_S_LEN
                 );
            localIp65504P2115SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2115SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2115S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2115S() {	 
			return (getShort(beginIp65504P2115S));
   	}
         int localIp65504P2115LCounter = -1;
         public boolean isIp65504P2115LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2115LCounter != sharedCounter;
            localIp65504P2115LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2115_L_LEN = 2;
  	/**
	 * serializeIp65504P2115L
	 */
	protected void serializeIp65504P2115L(short ip65504P2115L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2115L,IP_65504_P_2115_L_LEN)
                  ,beginIp65504P2115L
                  ,IP_65504_P_2115_L_LEN
                 );
            localIp65504P2115LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2115LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2115L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2115L() {	 
			return (getShort(beginIp65504P2115L));
   	}
         int localIp65504P2116SCounter = -1;
         public boolean isIp65504P2116SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2116SCounter != sharedCounter;
            localIp65504P2116SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2116_S_LEN = 2;
  	/**
	 * serializeIp65504P2116S
	 */
	protected void serializeIp65504P2116S(short ip65504P2116S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2116S,IP_65504_P_2116_S_LEN)
                  ,beginIp65504P2116S
                  ,IP_65504_P_2116_S_LEN
                 );
            localIp65504P2116SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2116SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2116S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2116S() {	 
			return (getShort(beginIp65504P2116S));
   	}
         int localIp65504P2116LCounter = -1;
         public boolean isIp65504P2116LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2116LCounter != sharedCounter;
            localIp65504P2116LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2116_L_LEN = 2;
  	/**
	 * serializeIp65504P2116L
	 */
	protected void serializeIp65504P2116L(short ip65504P2116L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2116L,IP_65504_P_2116_L_LEN)
                  ,beginIp65504P2116L
                  ,IP_65504_P_2116_L_LEN
                 );
            localIp65504P2116LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2116LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2116L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2116L() {	 
			return (getShort(beginIp65504P2116L));
   	}
         int localIp65504P2117SCounter = -1;
         public boolean isIp65504P2117SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2117SCounter != sharedCounter;
            localIp65504P2117SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2117_S_LEN = 2;
  	/**
	 * serializeIp65504P2117S
	 */
	protected void serializeIp65504P2117S(short ip65504P2117S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2117S,IP_65504_P_2117_S_LEN)
                  ,beginIp65504P2117S
                  ,IP_65504_P_2117_S_LEN
                 );
            localIp65504P2117SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2117SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2117S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2117S() {	 
			return (getShort(beginIp65504P2117S));
   	}
         int localIp65504P2117LCounter = -1;
         public boolean isIp65504P2117LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2117LCounter != sharedCounter;
            localIp65504P2117LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2117_L_LEN = 2;
  	/**
	 * serializeIp65504P2117L
	 */
	protected void serializeIp65504P2117L(short ip65504P2117L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2117L,IP_65504_P_2117_L_LEN)
                  ,beginIp65504P2117L
                  ,IP_65504_P_2117_L_LEN
                 );
            localIp65504P2117LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2117LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2117L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2117L() {	 
			return (getShort(beginIp65504P2117L));
   	}
         int localIp65504P2118SCounter = -1;
         public boolean isIp65504P2118SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2118SCounter != sharedCounter;
            localIp65504P2118SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2118_S_LEN = 2;
  	/**
	 * serializeIp65504P2118S
	 */
	protected void serializeIp65504P2118S(short ip65504P2118S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2118S,IP_65504_P_2118_S_LEN)
                  ,beginIp65504P2118S
                  ,IP_65504_P_2118_S_LEN
                 );
            localIp65504P2118SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2118SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2118S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2118S() {	 
			return (getShort(beginIp65504P2118S));
   	}
         int localIp65504P2118LCounter = -1;
         public boolean isIp65504P2118LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2118LCounter != sharedCounter;
            localIp65504P2118LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2118_L_LEN = 2;
  	/**
	 * serializeIp65504P2118L
	 */
	protected void serializeIp65504P2118L(short ip65504P2118L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2118L,IP_65504_P_2118_L_LEN)
                  ,beginIp65504P2118L
                  ,IP_65504_P_2118_L_LEN
                 );
            localIp65504P2118LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2118LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2118L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2118L() {	 
			return (getShort(beginIp65504P2118L));
   	}
         int localIp65504P2119SCounter = -1;
         public boolean isIp65504P2119SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2119SCounter != sharedCounter;
            localIp65504P2119SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2119_S_LEN = 2;
  	/**
	 * serializeIp65504P2119S
	 */
	protected void serializeIp65504P2119S(short ip65504P2119S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2119S,IP_65504_P_2119_S_LEN)
                  ,beginIp65504P2119S
                  ,IP_65504_P_2119_S_LEN
                 );
            localIp65504P2119SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2119SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2119S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2119S() {	 
			return (getShort(beginIp65504P2119S));
   	}
         int localIp65504P2119LCounter = -1;
         public boolean isIp65504P2119LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2119LCounter != sharedCounter;
            localIp65504P2119LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2119_L_LEN = 2;
  	/**
	 * serializeIp65504P2119L
	 */
	protected void serializeIp65504P2119L(short ip65504P2119L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2119L,IP_65504_P_2119_L_LEN)
                  ,beginIp65504P2119L
                  ,IP_65504_P_2119_L_LEN
                 );
            localIp65504P2119LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2119LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2119L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2119L() {	 
			return (getShort(beginIp65504P2119L));
   	}
         int localIp65504P2120SCounter = -1;
         public boolean isIp65504P2120SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2120SCounter != sharedCounter;
            localIp65504P2120SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2120_S_LEN = 2;
  	/**
	 * serializeIp65504P2120S
	 */
	protected void serializeIp65504P2120S(short ip65504P2120S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2120S,IP_65504_P_2120_S_LEN)
                  ,beginIp65504P2120S
                  ,IP_65504_P_2120_S_LEN
                 );
            localIp65504P2120SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2120SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2120S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2120S() {	 
			return (getShort(beginIp65504P2120S));
   	}
         int localIp65504P2120LCounter = -1;
         public boolean isIp65504P2120LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2120LCounter != sharedCounter;
            localIp65504P2120LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2120_L_LEN = 2;
  	/**
	 * serializeIp65504P2120L
	 */
	protected void serializeIp65504P2120L(short ip65504P2120L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2120L,IP_65504_P_2120_L_LEN)
                  ,beginIp65504P2120L
                  ,IP_65504_P_2120_L_LEN
                 );
            localIp65504P2120LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2120LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2120L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2120L() {	 
			return (getShort(beginIp65504P2120L));
   	}
         int localIp65504P2121SCounter = -1;
         public boolean isIp65504P2121SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2121SCounter != sharedCounter;
            localIp65504P2121SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2121_S_LEN = 2;
  	/**
	 * serializeIp65504P2121S
	 */
	protected void serializeIp65504P2121S(short ip65504P2121S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2121S,IP_65504_P_2121_S_LEN)
                  ,beginIp65504P2121S
                  ,IP_65504_P_2121_S_LEN
                 );
            localIp65504P2121SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2121SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2121S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2121S() {	 
			return (getShort(beginIp65504P2121S));
   	}
         int localIp65504P2121LCounter = -1;
         public boolean isIp65504P2121LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2121LCounter != sharedCounter;
            localIp65504P2121LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2121_L_LEN = 2;
  	/**
	 * serializeIp65504P2121L
	 */
	protected void serializeIp65504P2121L(short ip65504P2121L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2121L,IP_65504_P_2121_L_LEN)
                  ,beginIp65504P2121L
                  ,IP_65504_P_2121_L_LEN
                 );
            localIp65504P2121LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2121LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2121L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2121L() {	 
			return (getShort(beginIp65504P2121L));
   	}
         int localIp65504P2122SCounter = -1;
         public boolean isIp65504P2122SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2122SCounter != sharedCounter;
            localIp65504P2122SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2122_S_LEN = 2;
  	/**
	 * serializeIp65504P2122S
	 */
	protected void serializeIp65504P2122S(short ip65504P2122S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2122S,IP_65504_P_2122_S_LEN)
                  ,beginIp65504P2122S
                  ,IP_65504_P_2122_S_LEN
                 );
            localIp65504P2122SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2122SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2122S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2122S() {	 
			return (getShort(beginIp65504P2122S));
   	}
         int localIp65504P2122LCounter = -1;
         public boolean isIp65504P2122LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2122LCounter != sharedCounter;
            localIp65504P2122LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2122_L_LEN = 2;
  	/**
	 * serializeIp65504P2122L
	 */
	protected void serializeIp65504P2122L(short ip65504P2122L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2122L,IP_65504_P_2122_L_LEN)
                  ,beginIp65504P2122L
                  ,IP_65504_P_2122_L_LEN
                 );
            localIp65504P2122LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2122LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2122L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2122L() {	 
			return (getShort(beginIp65504P2122L));
   	}
         int localIp65504P2123SCounter = -1;
         public boolean isIp65504P2123SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2123SCounter != sharedCounter;
            localIp65504P2123SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2123_S_LEN = 2;
  	/**
	 * serializeIp65504P2123S
	 */
	protected void serializeIp65504P2123S(short ip65504P2123S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2123S,IP_65504_P_2123_S_LEN)
                  ,beginIp65504P2123S
                  ,IP_65504_P_2123_S_LEN
                 );
            localIp65504P2123SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2123SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2123S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2123S() {	 
			return (getShort(beginIp65504P2123S));
   	}
         int localIp65504P2123LCounter = -1;
         public boolean isIp65504P2123LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2123LCounter != sharedCounter;
            localIp65504P2123LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2123_L_LEN = 2;
  	/**
	 * serializeIp65504P2123L
	 */
	protected void serializeIp65504P2123L(short ip65504P2123L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2123L,IP_65504_P_2123_L_LEN)
                  ,beginIp65504P2123L
                  ,IP_65504_P_2123_L_LEN
                 );
            localIp65504P2123LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2123LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2123L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2123L() {	 
			return (getShort(beginIp65504P2123L));
   	}
         int localIp65504P2124SCounter = -1;
         public boolean isIp65504P2124SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2124SCounter != sharedCounter;
            localIp65504P2124SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2124_S_LEN = 2;
  	/**
	 * serializeIp65504P2124S
	 */
	protected void serializeIp65504P2124S(short ip65504P2124S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2124S,IP_65504_P_2124_S_LEN)
                  ,beginIp65504P2124S
                  ,IP_65504_P_2124_S_LEN
                 );
            localIp65504P2124SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2124SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2124S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2124S() {	 
			return (getShort(beginIp65504P2124S));
   	}
         int localIp65504P2124LCounter = -1;
         public boolean isIp65504P2124LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2124LCounter != sharedCounter;
            localIp65504P2124LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2124_L_LEN = 2;
  	/**
	 * serializeIp65504P2124L
	 */
	protected void serializeIp65504P2124L(short ip65504P2124L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2124L,IP_65504_P_2124_L_LEN)
                  ,beginIp65504P2124L
                  ,IP_65504_P_2124_L_LEN
                 );
            localIp65504P2124LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2124LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2124L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2124L() {	 
			return (getShort(beginIp65504P2124L));
   	}
         int localIp65504P2125SCounter = -1;
         public boolean isIp65504P2125SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2125SCounter != sharedCounter;
            localIp65504P2125SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2125_S_LEN = 2;
  	/**
	 * serializeIp65504P2125S
	 */
	protected void serializeIp65504P2125S(short ip65504P2125S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2125S,IP_65504_P_2125_S_LEN)
                  ,beginIp65504P2125S
                  ,IP_65504_P_2125_S_LEN
                 );
            localIp65504P2125SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2125SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2125S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2125S() {	 
			return (getShort(beginIp65504P2125S));
   	}
         int localIp65504P2125LCounter = -1;
         public boolean isIp65504P2125LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2125LCounter != sharedCounter;
            localIp65504P2125LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2125_L_LEN = 2;
  	/**
	 * serializeIp65504P2125L
	 */
	protected void serializeIp65504P2125L(short ip65504P2125L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2125L,IP_65504_P_2125_L_LEN)
                  ,beginIp65504P2125L
                  ,IP_65504_P_2125_L_LEN
                 );
            localIp65504P2125LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2125LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2125L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2125L() {	 
			return (getShort(beginIp65504P2125L));
   	}
         int localIp65504P2126SCounter = -1;
         public boolean isIp65504P2126SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2126SCounter != sharedCounter;
            localIp65504P2126SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2126_S_LEN = 2;
  	/**
	 * serializeIp65504P2126S
	 */
	protected void serializeIp65504P2126S(short ip65504P2126S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2126S,IP_65504_P_2126_S_LEN)
                  ,beginIp65504P2126S
                  ,IP_65504_P_2126_S_LEN
                 );
            localIp65504P2126SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2126SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2126S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2126S() {	 
			return (getShort(beginIp65504P2126S));
   	}
         int localIp65504P2126LCounter = -1;
         public boolean isIp65504P2126LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2126LCounter != sharedCounter;
            localIp65504P2126LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2126_L_LEN = 2;
  	/**
	 * serializeIp65504P2126L
	 */
	protected void serializeIp65504P2126L(short ip65504P2126L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2126L,IP_65504_P_2126_L_LEN)
                  ,beginIp65504P2126L
                  ,IP_65504_P_2126_L_LEN
                 );
            localIp65504P2126LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2126LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2126L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2126L() {	 
			return (getShort(beginIp65504P2126L));
   	}
         int localIp65504P2127SCounter = -1;
         public boolean isIp65504P2127SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2127SCounter != sharedCounter;
            localIp65504P2127SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2127_S_LEN = 2;
  	/**
	 * serializeIp65504P2127S
	 */
	protected void serializeIp65504P2127S(short ip65504P2127S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2127S,IP_65504_P_2127_S_LEN)
                  ,beginIp65504P2127S
                  ,IP_65504_P_2127_S_LEN
                 );
            localIp65504P2127SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2127SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2127S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2127S() {	 
			return (getShort(beginIp65504P2127S));
   	}
         int localIp65504P2127LCounter = -1;
         public boolean isIp65504P2127LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2127LCounter != sharedCounter;
            localIp65504P2127LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2127_L_LEN = 2;
  	/**
	 * serializeIp65504P2127L
	 */
	protected void serializeIp65504P2127L(short ip65504P2127L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2127L,IP_65504_P_2127_L_LEN)
                  ,beginIp65504P2127L
                  ,IP_65504_P_2127_L_LEN
                 );
            localIp65504P2127LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2127LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2127L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2127L() {	 
			return (getShort(beginIp65504P2127L));
   	}
         int localIp65504P2128SCounter = -1;
         public boolean isIp65504P2128SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2128SCounter != sharedCounter;
            localIp65504P2128SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2128_S_LEN = 2;
  	/**
	 * serializeIp65504P2128S
	 */
	protected void serializeIp65504P2128S(short ip65504P2128S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2128S,IP_65504_P_2128_S_LEN)
                  ,beginIp65504P2128S
                  ,IP_65504_P_2128_S_LEN
                 );
            localIp65504P2128SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2128SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2128S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2128S() {	 
			return (getShort(beginIp65504P2128S));
   	}
         int localIp65504P2128LCounter = -1;
         public boolean isIp65504P2128LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2128LCounter != sharedCounter;
            localIp65504P2128LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2128_L_LEN = 2;
  	/**
	 * serializeIp65504P2128L
	 */
	protected void serializeIp65504P2128L(short ip65504P2128L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2128L,IP_65504_P_2128_L_LEN)
                  ,beginIp65504P2128L
                  ,IP_65504_P_2128_L_LEN
                 );
            localIp65504P2128LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2128LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2128L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2128L() {	 
			return (getShort(beginIp65504P2128L));
   	}
         int localIp65504P2129SCounter = -1;
         public boolean isIp65504P2129SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2129SCounter != sharedCounter;
            localIp65504P2129SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2129_S_LEN = 2;
  	/**
	 * serializeIp65504P2129S
	 */
	protected void serializeIp65504P2129S(short ip65504P2129S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2129S,IP_65504_P_2129_S_LEN)
                  ,beginIp65504P2129S
                  ,IP_65504_P_2129_S_LEN
                 );
            localIp65504P2129SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2129SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2129S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2129S() {	 
			return (getShort(beginIp65504P2129S));
   	}
         int localIp65504P2129LCounter = -1;
         public boolean isIp65504P2129LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2129LCounter != sharedCounter;
            localIp65504P2129LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2129_L_LEN = 2;
  	/**
	 * serializeIp65504P2129L
	 */
	protected void serializeIp65504P2129L(short ip65504P2129L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2129L,IP_65504_P_2129_L_LEN)
                  ,beginIp65504P2129L
                  ,IP_65504_P_2129_L_LEN
                 );
            localIp65504P2129LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2129LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2129L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2129L() {	 
			return (getShort(beginIp65504P2129L));
   	}
         int localIp65504P2130SCounter = -1;
         public boolean isIp65504P2130SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2130SCounter != sharedCounter;
            localIp65504P2130SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2130_S_LEN = 2;
  	/**
	 * serializeIp65504P2130S
	 */
	protected void serializeIp65504P2130S(short ip65504P2130S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2130S,IP_65504_P_2130_S_LEN)
                  ,beginIp65504P2130S
                  ,IP_65504_P_2130_S_LEN
                 );
            localIp65504P2130SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2130SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2130S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2130S() {	 
			return (getShort(beginIp65504P2130S));
   	}
         int localIp65504P2130LCounter = -1;
         public boolean isIp65504P2130LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2130LCounter != sharedCounter;
            localIp65504P2130LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2130_L_LEN = 2;
  	/**
	 * serializeIp65504P2130L
	 */
	protected void serializeIp65504P2130L(short ip65504P2130L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2130L,IP_65504_P_2130_L_LEN)
                  ,beginIp65504P2130L
                  ,IP_65504_P_2130_L_LEN
                 );
            localIp65504P2130LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2130LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2130L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2130L() {	 
			return (getShort(beginIp65504P2130L));
   	}
         int localIp65504P2131SCounter = -1;
         public boolean isIp65504P2131SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2131SCounter != sharedCounter;
            localIp65504P2131SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2131_S_LEN = 2;
  	/**
	 * serializeIp65504P2131S
	 */
	protected void serializeIp65504P2131S(short ip65504P2131S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2131S,IP_65504_P_2131_S_LEN)
                  ,beginIp65504P2131S
                  ,IP_65504_P_2131_S_LEN
                 );
            localIp65504P2131SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2131SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2131S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2131S() {	 
			return (getShort(beginIp65504P2131S));
   	}
         int localIp65504P2131LCounter = -1;
         public boolean isIp65504P2131LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2131LCounter != sharedCounter;
            localIp65504P2131LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2131_L_LEN = 2;
  	/**
	 * serializeIp65504P2131L
	 */
	protected void serializeIp65504P2131L(short ip65504P2131L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2131L,IP_65504_P_2131_L_LEN)
                  ,beginIp65504P2131L
                  ,IP_65504_P_2131_L_LEN
                 );
            localIp65504P2131LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2131LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2131L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2131L() {	 
			return (getShort(beginIp65504P2131L));
   	}
         int localIp65504P2132SCounter = -1;
         public boolean isIp65504P2132SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2132SCounter != sharedCounter;
            localIp65504P2132SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2132_S_LEN = 2;
  	/**
	 * serializeIp65504P2132S
	 */
	protected void serializeIp65504P2132S(short ip65504P2132S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2132S,IP_65504_P_2132_S_LEN)
                  ,beginIp65504P2132S
                  ,IP_65504_P_2132_S_LEN
                 );
            localIp65504P2132SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2132SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2132S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2132S() {	 
			return (getShort(beginIp65504P2132S));
   	}
         int localIp65504P2132LCounter = -1;
         public boolean isIp65504P2132LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2132LCounter != sharedCounter;
            localIp65504P2132LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2132_L_LEN = 2;
  	/**
	 * serializeIp65504P2132L
	 */
	protected void serializeIp65504P2132L(short ip65504P2132L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2132L,IP_65504_P_2132_L_LEN)
                  ,beginIp65504P2132L
                  ,IP_65504_P_2132_L_LEN
                 );
            localIp65504P2132LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2132LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2132L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2132L() {	 
			return (getShort(beginIp65504P2132L));
   	}
         int localIp65504P2133SCounter = -1;
         public boolean isIp65504P2133SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2133SCounter != sharedCounter;
            localIp65504P2133SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2133_S_LEN = 2;
  	/**
	 * serializeIp65504P2133S
	 */
	protected void serializeIp65504P2133S(short ip65504P2133S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2133S,IP_65504_P_2133_S_LEN)
                  ,beginIp65504P2133S
                  ,IP_65504_P_2133_S_LEN
                 );
            localIp65504P2133SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2133SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2133S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2133S() {	 
			return (getShort(beginIp65504P2133S));
   	}
         int localIp65504P2133LCounter = -1;
         public boolean isIp65504P2133LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2133LCounter != sharedCounter;
            localIp65504P2133LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2133_L_LEN = 2;
  	/**
	 * serializeIp65504P2133L
	 */
	protected void serializeIp65504P2133L(short ip65504P2133L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2133L,IP_65504_P_2133_L_LEN)
                  ,beginIp65504P2133L
                  ,IP_65504_P_2133_L_LEN
                 );
            localIp65504P2133LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2133LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2133L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2133L() {	 
			return (getShort(beginIp65504P2133L));
   	}
         int localIp65504P2134SCounter = -1;
         public boolean isIp65504P2134SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2134SCounter != sharedCounter;
            localIp65504P2134SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2134_S_LEN = 2;
  	/**
	 * serializeIp65504P2134S
	 */
	protected void serializeIp65504P2134S(short ip65504P2134S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2134S,IP_65504_P_2134_S_LEN)
                  ,beginIp65504P2134S
                  ,IP_65504_P_2134_S_LEN
                 );
            localIp65504P2134SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2134SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2134S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2134S() {	 
			return (getShort(beginIp65504P2134S));
   	}
         int localIp65504P2134LCounter = -1;
         public boolean isIp65504P2134LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2134LCounter != sharedCounter;
            localIp65504P2134LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2134_L_LEN = 2;
  	/**
	 * serializeIp65504P2134L
	 */
	protected void serializeIp65504P2134L(short ip65504P2134L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2134L,IP_65504_P_2134_L_LEN)
                  ,beginIp65504P2134L
                  ,IP_65504_P_2134_L_LEN
                 );
            localIp65504P2134LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2134LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2134L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2134L() {	 
			return (getShort(beginIp65504P2134L));
   	}
         int localIp65504P2135SCounter = -1;
         public boolean isIp65504P2135SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2135SCounter != sharedCounter;
            localIp65504P2135SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2135_S_LEN = 2;
  	/**
	 * serializeIp65504P2135S
	 */
	protected void serializeIp65504P2135S(short ip65504P2135S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2135S,IP_65504_P_2135_S_LEN)
                  ,beginIp65504P2135S
                  ,IP_65504_P_2135_S_LEN
                 );
            localIp65504P2135SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2135SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2135S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2135S() {	 
			return (getShort(beginIp65504P2135S));
   	}
         int localIp65504P2135LCounter = -1;
         public boolean isIp65504P2135LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2135LCounter != sharedCounter;
            localIp65504P2135LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2135_L_LEN = 2;
  	/**
	 * serializeIp65504P2135L
	 */
	protected void serializeIp65504P2135L(short ip65504P2135L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2135L,IP_65504_P_2135_L_LEN)
                  ,beginIp65504P2135L
                  ,IP_65504_P_2135_L_LEN
                 );
            localIp65504P2135LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2135LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2135L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2135L() {	 
			return (getShort(beginIp65504P2135L));
   	}
         int localIp65504P2136SCounter = -1;
         public boolean isIp65504P2136SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2136SCounter != sharedCounter;
            localIp65504P2136SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2136_S_LEN = 2;
  	/**
	 * serializeIp65504P2136S
	 */
	protected void serializeIp65504P2136S(short ip65504P2136S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2136S,IP_65504_P_2136_S_LEN)
                  ,beginIp65504P2136S
                  ,IP_65504_P_2136_S_LEN
                 );
            localIp65504P2136SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2136SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2136S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2136S() {	 
			return (getShort(beginIp65504P2136S));
   	}
         int localIp65504P2136LCounter = -1;
         public boolean isIp65504P2136LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2136LCounter != sharedCounter;
            localIp65504P2136LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2136_L_LEN = 2;
  	/**
	 * serializeIp65504P2136L
	 */
	protected void serializeIp65504P2136L(short ip65504P2136L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2136L,IP_65504_P_2136_L_LEN)
                  ,beginIp65504P2136L
                  ,IP_65504_P_2136_L_LEN
                 );
            localIp65504P2136LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2136LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2136L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2136L() {	 
			return (getShort(beginIp65504P2136L));
   	}
         int localIp65504P2137SCounter = -1;
         public boolean isIp65504P2137SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2137SCounter != sharedCounter;
            localIp65504P2137SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2137_S_LEN = 2;
  	/**
	 * serializeIp65504P2137S
	 */
	protected void serializeIp65504P2137S(short ip65504P2137S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2137S,IP_65504_P_2137_S_LEN)
                  ,beginIp65504P2137S
                  ,IP_65504_P_2137_S_LEN
                 );
            localIp65504P2137SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2137SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2137S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2137S() {	 
			return (getShort(beginIp65504P2137S));
   	}
         int localIp65504P2137LCounter = -1;
         public boolean isIp65504P2137LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2137LCounter != sharedCounter;
            localIp65504P2137LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2137_L_LEN = 2;
  	/**
	 * serializeIp65504P2137L
	 */
	protected void serializeIp65504P2137L(short ip65504P2137L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2137L,IP_65504_P_2137_L_LEN)
                  ,beginIp65504P2137L
                  ,IP_65504_P_2137_L_LEN
                 );
            localIp65504P2137LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2137LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2137L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2137L() {	 
			return (getShort(beginIp65504P2137L));
   	}
         int localIp65504P2138SCounter = -1;
         public boolean isIp65504P2138SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2138SCounter != sharedCounter;
            localIp65504P2138SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2138_S_LEN = 2;
  	/**
	 * serializeIp65504P2138S
	 */
	protected void serializeIp65504P2138S(short ip65504P2138S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2138S,IP_65504_P_2138_S_LEN)
                  ,beginIp65504P2138S
                  ,IP_65504_P_2138_S_LEN
                 );
            localIp65504P2138SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2138SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2138S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2138S() {	 
			return (getShort(beginIp65504P2138S));
   	}
         int localIp65504P2138LCounter = -1;
         public boolean isIp65504P2138LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2138LCounter != sharedCounter;
            localIp65504P2138LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2138_L_LEN = 2;
  	/**
	 * serializeIp65504P2138L
	 */
	protected void serializeIp65504P2138L(short ip65504P2138L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2138L,IP_65504_P_2138_L_LEN)
                  ,beginIp65504P2138L
                  ,IP_65504_P_2138_L_LEN
                 );
            localIp65504P2138LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2138LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2138L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2138L() {	 
			return (getShort(beginIp65504P2138L));
   	}
         int localIp65504P2139SCounter = -1;
         public boolean isIp65504P2139SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2139SCounter != sharedCounter;
            localIp65504P2139SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2139_S_LEN = 2;
  	/**
	 * serializeIp65504P2139S
	 */
	protected void serializeIp65504P2139S(short ip65504P2139S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2139S,IP_65504_P_2139_S_LEN)
                  ,beginIp65504P2139S
                  ,IP_65504_P_2139_S_LEN
                 );
            localIp65504P2139SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2139SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2139S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2139S() {	 
			return (getShort(beginIp65504P2139S));
   	}
         int localIp65504P2139LCounter = -1;
         public boolean isIp65504P2139LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2139LCounter != sharedCounter;
            localIp65504P2139LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2139_L_LEN = 2;
  	/**
	 * serializeIp65504P2139L
	 */
	protected void serializeIp65504P2139L(short ip65504P2139L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2139L,IP_65504_P_2139_L_LEN)
                  ,beginIp65504P2139L
                  ,IP_65504_P_2139_L_LEN
                 );
            localIp65504P2139LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2139LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2139L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2139L() {	 
			return (getShort(beginIp65504P2139L));
   	}




}
  
