package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup74Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup74Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup74Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_74_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2264S;
            protected  int beginIp65504P2264L;
            protected  int beginIp65504P2265S;
            protected  int beginIp65504P2265L;
            protected  int beginIp65504P2266S;
            protected  int beginIp65504P2266L;
            protected  int beginIp65504P2267S;
            protected  int beginIp65504P2267L;
            protected  int beginIp65504P2268S;
            protected  int beginIp65504P2268L;
            protected  int beginIp65504P2269S;
            protected  int beginIp65504P2269L;
            protected  int beginIp65504P2270S;
            protected  int beginIp65504P2270L;
            protected  int beginIp65504P2271S;
            protected  int beginIp65504P2271L;
            protected  int beginIp65504P2272S;
            protected  int beginIp65504P2272L;
            protected  int beginIp65504P2273S;
            protected  int beginIp65504P2273L;
            protected  int beginIp65504P2274S;
            protected  int beginIp65504P2274L;
            protected  int beginIp65504P2275S;
            protected  int beginIp65504P2275L;
            protected  int beginIp65504P2276S;
            protected  int beginIp65504P2276L;
            protected  int beginIp65504P2277S;
            protected  int beginIp65504P2277L;
            protected  int beginIp65504P2278S;
            protected  int beginIp65504P2278L;
            protected  int beginIp65504P2279S;
            protected  int beginIp65504P2279L;
            protected  int beginIp65504P2280S;
            protected  int beginIp65504P2280L;
            protected  int beginIp65504P2281S;
            protected  int beginIp65504P2281L;
            protected  int beginIp65504P2282S;
            protected  int beginIp65504P2282L;
            protected  int beginIp65504P2283S;
            protected  int beginIp65504P2283L;
            protected  int beginIp65504P2284S;
            protected  int beginIp65504P2284L;
            protected  int beginIp65504P2285S;
            protected  int beginIp65504P2285L;
            protected  int beginIp65504P2286S;
            protected  int beginIp65504P2286L;
            protected  int beginIp65504P2287S;
            protected  int beginIp65504P2287L;
            protected  int beginIp65504P2288S;
            protected  int beginIp65504P2288L;
            protected  int beginIp65504P2289S;
            protected  int beginIp65504P2289L;
            protected  int beginIp65504P2290S;
            protected  int beginIp65504P2290L;
            protected  int beginIp65504P2291S;
            protected  int beginIp65504P2291L;
            protected  int beginIp65504P2292S;
            protected  int beginIp65504P2292L;
            protected  int beginIp65504P2293S;
            protected  int beginIp65504P2293L;
            protected  int beginIp65504P2294S;
            protected  int beginIp65504P2294L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup74Serialized
	**/
    public Ip65504PdsNamesLargeGroup74Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup74Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup74Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup74Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18100); // serialize this field at offset 18100 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup74Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18100 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup74Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_74_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2264S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2264L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2265S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2265L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2266S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2266L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2267S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2267L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2268S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2268L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2269S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2269L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2270S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2270L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2271S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2271L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2272S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2272L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2273S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2273L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2274S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2274L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2275S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2275L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2276S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2276L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2277S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2277L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2278S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2278L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2279S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2279L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2280S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2280L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2281S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2281L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2282S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2282L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2283S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2283L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2284S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2284L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2285S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2285L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2286S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2286L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2287S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2287L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2288S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2288L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2289S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2289L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2290S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2290L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2291S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2291L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2292S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2292L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2293S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2293L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2294S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2294L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2264SCounter = -1;
         public boolean isIp65504P2264SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2264SCounter != sharedCounter;
            localIp65504P2264SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2264_S_LEN = 2;
  	/**
	 * serializeIp65504P2264S
	 */
	protected void serializeIp65504P2264S(short ip65504P2264S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2264S,IP_65504_P_2264_S_LEN)
                  ,beginIp65504P2264S
                  ,IP_65504_P_2264_S_LEN
                 );
            localIp65504P2264SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2264SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2264S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2264S() {	 
			return (getShort(beginIp65504P2264S));
   	}
         int localIp65504P2264LCounter = -1;
         public boolean isIp65504P2264LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2264LCounter != sharedCounter;
            localIp65504P2264LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2264_L_LEN = 2;
  	/**
	 * serializeIp65504P2264L
	 */
	protected void serializeIp65504P2264L(short ip65504P2264L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2264L,IP_65504_P_2264_L_LEN)
                  ,beginIp65504P2264L
                  ,IP_65504_P_2264_L_LEN
                 );
            localIp65504P2264LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2264LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2264L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2264L() {	 
			return (getShort(beginIp65504P2264L));
   	}
         int localIp65504P2265SCounter = -1;
         public boolean isIp65504P2265SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2265SCounter != sharedCounter;
            localIp65504P2265SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2265_S_LEN = 2;
  	/**
	 * serializeIp65504P2265S
	 */
	protected void serializeIp65504P2265S(short ip65504P2265S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2265S,IP_65504_P_2265_S_LEN)
                  ,beginIp65504P2265S
                  ,IP_65504_P_2265_S_LEN
                 );
            localIp65504P2265SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2265SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2265S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2265S() {	 
			return (getShort(beginIp65504P2265S));
   	}
         int localIp65504P2265LCounter = -1;
         public boolean isIp65504P2265LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2265LCounter != sharedCounter;
            localIp65504P2265LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2265_L_LEN = 2;
  	/**
	 * serializeIp65504P2265L
	 */
	protected void serializeIp65504P2265L(short ip65504P2265L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2265L,IP_65504_P_2265_L_LEN)
                  ,beginIp65504P2265L
                  ,IP_65504_P_2265_L_LEN
                 );
            localIp65504P2265LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2265LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2265L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2265L() {	 
			return (getShort(beginIp65504P2265L));
   	}
         int localIp65504P2266SCounter = -1;
         public boolean isIp65504P2266SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2266SCounter != sharedCounter;
            localIp65504P2266SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2266_S_LEN = 2;
  	/**
	 * serializeIp65504P2266S
	 */
	protected void serializeIp65504P2266S(short ip65504P2266S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2266S,IP_65504_P_2266_S_LEN)
                  ,beginIp65504P2266S
                  ,IP_65504_P_2266_S_LEN
                 );
            localIp65504P2266SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2266SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2266S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2266S() {	 
			return (getShort(beginIp65504P2266S));
   	}
         int localIp65504P2266LCounter = -1;
         public boolean isIp65504P2266LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2266LCounter != sharedCounter;
            localIp65504P2266LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2266_L_LEN = 2;
  	/**
	 * serializeIp65504P2266L
	 */
	protected void serializeIp65504P2266L(short ip65504P2266L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2266L,IP_65504_P_2266_L_LEN)
                  ,beginIp65504P2266L
                  ,IP_65504_P_2266_L_LEN
                 );
            localIp65504P2266LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2266LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2266L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2266L() {	 
			return (getShort(beginIp65504P2266L));
   	}
         int localIp65504P2267SCounter = -1;
         public boolean isIp65504P2267SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2267SCounter != sharedCounter;
            localIp65504P2267SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2267_S_LEN = 2;
  	/**
	 * serializeIp65504P2267S
	 */
	protected void serializeIp65504P2267S(short ip65504P2267S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2267S,IP_65504_P_2267_S_LEN)
                  ,beginIp65504P2267S
                  ,IP_65504_P_2267_S_LEN
                 );
            localIp65504P2267SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2267SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2267S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2267S() {	 
			return (getShort(beginIp65504P2267S));
   	}
         int localIp65504P2267LCounter = -1;
         public boolean isIp65504P2267LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2267LCounter != sharedCounter;
            localIp65504P2267LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2267_L_LEN = 2;
  	/**
	 * serializeIp65504P2267L
	 */
	protected void serializeIp65504P2267L(short ip65504P2267L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2267L,IP_65504_P_2267_L_LEN)
                  ,beginIp65504P2267L
                  ,IP_65504_P_2267_L_LEN
                 );
            localIp65504P2267LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2267LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2267L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2267L() {	 
			return (getShort(beginIp65504P2267L));
   	}
         int localIp65504P2268SCounter = -1;
         public boolean isIp65504P2268SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2268SCounter != sharedCounter;
            localIp65504P2268SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2268_S_LEN = 2;
  	/**
	 * serializeIp65504P2268S
	 */
	protected void serializeIp65504P2268S(short ip65504P2268S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2268S,IP_65504_P_2268_S_LEN)
                  ,beginIp65504P2268S
                  ,IP_65504_P_2268_S_LEN
                 );
            localIp65504P2268SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2268SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2268S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2268S() {	 
			return (getShort(beginIp65504P2268S));
   	}
         int localIp65504P2268LCounter = -1;
         public boolean isIp65504P2268LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2268LCounter != sharedCounter;
            localIp65504P2268LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2268_L_LEN = 2;
  	/**
	 * serializeIp65504P2268L
	 */
	protected void serializeIp65504P2268L(short ip65504P2268L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2268L,IP_65504_P_2268_L_LEN)
                  ,beginIp65504P2268L
                  ,IP_65504_P_2268_L_LEN
                 );
            localIp65504P2268LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2268LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2268L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2268L() {	 
			return (getShort(beginIp65504P2268L));
   	}
         int localIp65504P2269SCounter = -1;
         public boolean isIp65504P2269SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2269SCounter != sharedCounter;
            localIp65504P2269SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2269_S_LEN = 2;
  	/**
	 * serializeIp65504P2269S
	 */
	protected void serializeIp65504P2269S(short ip65504P2269S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2269S,IP_65504_P_2269_S_LEN)
                  ,beginIp65504P2269S
                  ,IP_65504_P_2269_S_LEN
                 );
            localIp65504P2269SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2269SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2269S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2269S() {	 
			return (getShort(beginIp65504P2269S));
   	}
         int localIp65504P2269LCounter = -1;
         public boolean isIp65504P2269LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2269LCounter != sharedCounter;
            localIp65504P2269LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2269_L_LEN = 2;
  	/**
	 * serializeIp65504P2269L
	 */
	protected void serializeIp65504P2269L(short ip65504P2269L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2269L,IP_65504_P_2269_L_LEN)
                  ,beginIp65504P2269L
                  ,IP_65504_P_2269_L_LEN
                 );
            localIp65504P2269LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2269LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2269L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2269L() {	 
			return (getShort(beginIp65504P2269L));
   	}
         int localIp65504P2270SCounter = -1;
         public boolean isIp65504P2270SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2270SCounter != sharedCounter;
            localIp65504P2270SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2270_S_LEN = 2;
  	/**
	 * serializeIp65504P2270S
	 */
	protected void serializeIp65504P2270S(short ip65504P2270S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2270S,IP_65504_P_2270_S_LEN)
                  ,beginIp65504P2270S
                  ,IP_65504_P_2270_S_LEN
                 );
            localIp65504P2270SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2270SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2270S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2270S() {	 
			return (getShort(beginIp65504P2270S));
   	}
         int localIp65504P2270LCounter = -1;
         public boolean isIp65504P2270LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2270LCounter != sharedCounter;
            localIp65504P2270LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2270_L_LEN = 2;
  	/**
	 * serializeIp65504P2270L
	 */
	protected void serializeIp65504P2270L(short ip65504P2270L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2270L,IP_65504_P_2270_L_LEN)
                  ,beginIp65504P2270L
                  ,IP_65504_P_2270_L_LEN
                 );
            localIp65504P2270LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2270LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2270L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2270L() {	 
			return (getShort(beginIp65504P2270L));
   	}
         int localIp65504P2271SCounter = -1;
         public boolean isIp65504P2271SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2271SCounter != sharedCounter;
            localIp65504P2271SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2271_S_LEN = 2;
  	/**
	 * serializeIp65504P2271S
	 */
	protected void serializeIp65504P2271S(short ip65504P2271S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2271S,IP_65504_P_2271_S_LEN)
                  ,beginIp65504P2271S
                  ,IP_65504_P_2271_S_LEN
                 );
            localIp65504P2271SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2271SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2271S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2271S() {	 
			return (getShort(beginIp65504P2271S));
   	}
         int localIp65504P2271LCounter = -1;
         public boolean isIp65504P2271LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2271LCounter != sharedCounter;
            localIp65504P2271LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2271_L_LEN = 2;
  	/**
	 * serializeIp65504P2271L
	 */
	protected void serializeIp65504P2271L(short ip65504P2271L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2271L,IP_65504_P_2271_L_LEN)
                  ,beginIp65504P2271L
                  ,IP_65504_P_2271_L_LEN
                 );
            localIp65504P2271LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2271LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2271L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2271L() {	 
			return (getShort(beginIp65504P2271L));
   	}
         int localIp65504P2272SCounter = -1;
         public boolean isIp65504P2272SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2272SCounter != sharedCounter;
            localIp65504P2272SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2272_S_LEN = 2;
  	/**
	 * serializeIp65504P2272S
	 */
	protected void serializeIp65504P2272S(short ip65504P2272S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2272S,IP_65504_P_2272_S_LEN)
                  ,beginIp65504P2272S
                  ,IP_65504_P_2272_S_LEN
                 );
            localIp65504P2272SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2272SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2272S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2272S() {	 
			return (getShort(beginIp65504P2272S));
   	}
         int localIp65504P2272LCounter = -1;
         public boolean isIp65504P2272LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2272LCounter != sharedCounter;
            localIp65504P2272LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2272_L_LEN = 2;
  	/**
	 * serializeIp65504P2272L
	 */
	protected void serializeIp65504P2272L(short ip65504P2272L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2272L,IP_65504_P_2272_L_LEN)
                  ,beginIp65504P2272L
                  ,IP_65504_P_2272_L_LEN
                 );
            localIp65504P2272LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2272LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2272L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2272L() {	 
			return (getShort(beginIp65504P2272L));
   	}
         int localIp65504P2273SCounter = -1;
         public boolean isIp65504P2273SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2273SCounter != sharedCounter;
            localIp65504P2273SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2273_S_LEN = 2;
  	/**
	 * serializeIp65504P2273S
	 */
	protected void serializeIp65504P2273S(short ip65504P2273S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2273S,IP_65504_P_2273_S_LEN)
                  ,beginIp65504P2273S
                  ,IP_65504_P_2273_S_LEN
                 );
            localIp65504P2273SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2273SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2273S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2273S() {	 
			return (getShort(beginIp65504P2273S));
   	}
         int localIp65504P2273LCounter = -1;
         public boolean isIp65504P2273LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2273LCounter != sharedCounter;
            localIp65504P2273LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2273_L_LEN = 2;
  	/**
	 * serializeIp65504P2273L
	 */
	protected void serializeIp65504P2273L(short ip65504P2273L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2273L,IP_65504_P_2273_L_LEN)
                  ,beginIp65504P2273L
                  ,IP_65504_P_2273_L_LEN
                 );
            localIp65504P2273LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2273LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2273L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2273L() {	 
			return (getShort(beginIp65504P2273L));
   	}
         int localIp65504P2274SCounter = -1;
         public boolean isIp65504P2274SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2274SCounter != sharedCounter;
            localIp65504P2274SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2274_S_LEN = 2;
  	/**
	 * serializeIp65504P2274S
	 */
	protected void serializeIp65504P2274S(short ip65504P2274S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2274S,IP_65504_P_2274_S_LEN)
                  ,beginIp65504P2274S
                  ,IP_65504_P_2274_S_LEN
                 );
            localIp65504P2274SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2274SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2274S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2274S() {	 
			return (getShort(beginIp65504P2274S));
   	}
         int localIp65504P2274LCounter = -1;
         public boolean isIp65504P2274LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2274LCounter != sharedCounter;
            localIp65504P2274LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2274_L_LEN = 2;
  	/**
	 * serializeIp65504P2274L
	 */
	protected void serializeIp65504P2274L(short ip65504P2274L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2274L,IP_65504_P_2274_L_LEN)
                  ,beginIp65504P2274L
                  ,IP_65504_P_2274_L_LEN
                 );
            localIp65504P2274LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2274LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2274L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2274L() {	 
			return (getShort(beginIp65504P2274L));
   	}
         int localIp65504P2275SCounter = -1;
         public boolean isIp65504P2275SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2275SCounter != sharedCounter;
            localIp65504P2275SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2275_S_LEN = 2;
  	/**
	 * serializeIp65504P2275S
	 */
	protected void serializeIp65504P2275S(short ip65504P2275S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2275S,IP_65504_P_2275_S_LEN)
                  ,beginIp65504P2275S
                  ,IP_65504_P_2275_S_LEN
                 );
            localIp65504P2275SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2275SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2275S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2275S() {	 
			return (getShort(beginIp65504P2275S));
   	}
         int localIp65504P2275LCounter = -1;
         public boolean isIp65504P2275LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2275LCounter != sharedCounter;
            localIp65504P2275LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2275_L_LEN = 2;
  	/**
	 * serializeIp65504P2275L
	 */
	protected void serializeIp65504P2275L(short ip65504P2275L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2275L,IP_65504_P_2275_L_LEN)
                  ,beginIp65504P2275L
                  ,IP_65504_P_2275_L_LEN
                 );
            localIp65504P2275LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2275LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2275L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2275L() {	 
			return (getShort(beginIp65504P2275L));
   	}
         int localIp65504P2276SCounter = -1;
         public boolean isIp65504P2276SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2276SCounter != sharedCounter;
            localIp65504P2276SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2276_S_LEN = 2;
  	/**
	 * serializeIp65504P2276S
	 */
	protected void serializeIp65504P2276S(short ip65504P2276S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2276S,IP_65504_P_2276_S_LEN)
                  ,beginIp65504P2276S
                  ,IP_65504_P_2276_S_LEN
                 );
            localIp65504P2276SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2276SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2276S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2276S() {	 
			return (getShort(beginIp65504P2276S));
   	}
         int localIp65504P2276LCounter = -1;
         public boolean isIp65504P2276LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2276LCounter != sharedCounter;
            localIp65504P2276LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2276_L_LEN = 2;
  	/**
	 * serializeIp65504P2276L
	 */
	protected void serializeIp65504P2276L(short ip65504P2276L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2276L,IP_65504_P_2276_L_LEN)
                  ,beginIp65504P2276L
                  ,IP_65504_P_2276_L_LEN
                 );
            localIp65504P2276LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2276LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2276L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2276L() {	 
			return (getShort(beginIp65504P2276L));
   	}
         int localIp65504P2277SCounter = -1;
         public boolean isIp65504P2277SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2277SCounter != sharedCounter;
            localIp65504P2277SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2277_S_LEN = 2;
  	/**
	 * serializeIp65504P2277S
	 */
	protected void serializeIp65504P2277S(short ip65504P2277S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2277S,IP_65504_P_2277_S_LEN)
                  ,beginIp65504P2277S
                  ,IP_65504_P_2277_S_LEN
                 );
            localIp65504P2277SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2277SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2277S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2277S() {	 
			return (getShort(beginIp65504P2277S));
   	}
         int localIp65504P2277LCounter = -1;
         public boolean isIp65504P2277LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2277LCounter != sharedCounter;
            localIp65504P2277LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2277_L_LEN = 2;
  	/**
	 * serializeIp65504P2277L
	 */
	protected void serializeIp65504P2277L(short ip65504P2277L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2277L,IP_65504_P_2277_L_LEN)
                  ,beginIp65504P2277L
                  ,IP_65504_P_2277_L_LEN
                 );
            localIp65504P2277LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2277LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2277L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2277L() {	 
			return (getShort(beginIp65504P2277L));
   	}
         int localIp65504P2278SCounter = -1;
         public boolean isIp65504P2278SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2278SCounter != sharedCounter;
            localIp65504P2278SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2278_S_LEN = 2;
  	/**
	 * serializeIp65504P2278S
	 */
	protected void serializeIp65504P2278S(short ip65504P2278S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2278S,IP_65504_P_2278_S_LEN)
                  ,beginIp65504P2278S
                  ,IP_65504_P_2278_S_LEN
                 );
            localIp65504P2278SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2278SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2278S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2278S() {	 
			return (getShort(beginIp65504P2278S));
   	}
         int localIp65504P2278LCounter = -1;
         public boolean isIp65504P2278LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2278LCounter != sharedCounter;
            localIp65504P2278LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2278_L_LEN = 2;
  	/**
	 * serializeIp65504P2278L
	 */
	protected void serializeIp65504P2278L(short ip65504P2278L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2278L,IP_65504_P_2278_L_LEN)
                  ,beginIp65504P2278L
                  ,IP_65504_P_2278_L_LEN
                 );
            localIp65504P2278LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2278LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2278L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2278L() {	 
			return (getShort(beginIp65504P2278L));
   	}
         int localIp65504P2279SCounter = -1;
         public boolean isIp65504P2279SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2279SCounter != sharedCounter;
            localIp65504P2279SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2279_S_LEN = 2;
  	/**
	 * serializeIp65504P2279S
	 */
	protected void serializeIp65504P2279S(short ip65504P2279S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2279S,IP_65504_P_2279_S_LEN)
                  ,beginIp65504P2279S
                  ,IP_65504_P_2279_S_LEN
                 );
            localIp65504P2279SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2279SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2279S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2279S() {	 
			return (getShort(beginIp65504P2279S));
   	}
         int localIp65504P2279LCounter = -1;
         public boolean isIp65504P2279LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2279LCounter != sharedCounter;
            localIp65504P2279LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2279_L_LEN = 2;
  	/**
	 * serializeIp65504P2279L
	 */
	protected void serializeIp65504P2279L(short ip65504P2279L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2279L,IP_65504_P_2279_L_LEN)
                  ,beginIp65504P2279L
                  ,IP_65504_P_2279_L_LEN
                 );
            localIp65504P2279LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2279LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2279L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2279L() {	 
			return (getShort(beginIp65504P2279L));
   	}
         int localIp65504P2280SCounter = -1;
         public boolean isIp65504P2280SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2280SCounter != sharedCounter;
            localIp65504P2280SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2280_S_LEN = 2;
  	/**
	 * serializeIp65504P2280S
	 */
	protected void serializeIp65504P2280S(short ip65504P2280S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2280S,IP_65504_P_2280_S_LEN)
                  ,beginIp65504P2280S
                  ,IP_65504_P_2280_S_LEN
                 );
            localIp65504P2280SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2280SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2280S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2280S() {	 
			return (getShort(beginIp65504P2280S));
   	}
         int localIp65504P2280LCounter = -1;
         public boolean isIp65504P2280LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2280LCounter != sharedCounter;
            localIp65504P2280LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2280_L_LEN = 2;
  	/**
	 * serializeIp65504P2280L
	 */
	protected void serializeIp65504P2280L(short ip65504P2280L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2280L,IP_65504_P_2280_L_LEN)
                  ,beginIp65504P2280L
                  ,IP_65504_P_2280_L_LEN
                 );
            localIp65504P2280LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2280LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2280L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2280L() {	 
			return (getShort(beginIp65504P2280L));
   	}
         int localIp65504P2281SCounter = -1;
         public boolean isIp65504P2281SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2281SCounter != sharedCounter;
            localIp65504P2281SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2281_S_LEN = 2;
  	/**
	 * serializeIp65504P2281S
	 */
	protected void serializeIp65504P2281S(short ip65504P2281S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2281S,IP_65504_P_2281_S_LEN)
                  ,beginIp65504P2281S
                  ,IP_65504_P_2281_S_LEN
                 );
            localIp65504P2281SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2281SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2281S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2281S() {	 
			return (getShort(beginIp65504P2281S));
   	}
         int localIp65504P2281LCounter = -1;
         public boolean isIp65504P2281LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2281LCounter != sharedCounter;
            localIp65504P2281LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2281_L_LEN = 2;
  	/**
	 * serializeIp65504P2281L
	 */
	protected void serializeIp65504P2281L(short ip65504P2281L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2281L,IP_65504_P_2281_L_LEN)
                  ,beginIp65504P2281L
                  ,IP_65504_P_2281_L_LEN
                 );
            localIp65504P2281LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2281LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2281L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2281L() {	 
			return (getShort(beginIp65504P2281L));
   	}
         int localIp65504P2282SCounter = -1;
         public boolean isIp65504P2282SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2282SCounter != sharedCounter;
            localIp65504P2282SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2282_S_LEN = 2;
  	/**
	 * serializeIp65504P2282S
	 */
	protected void serializeIp65504P2282S(short ip65504P2282S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2282S,IP_65504_P_2282_S_LEN)
                  ,beginIp65504P2282S
                  ,IP_65504_P_2282_S_LEN
                 );
            localIp65504P2282SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2282SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2282S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2282S() {	 
			return (getShort(beginIp65504P2282S));
   	}
         int localIp65504P2282LCounter = -1;
         public boolean isIp65504P2282LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2282LCounter != sharedCounter;
            localIp65504P2282LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2282_L_LEN = 2;
  	/**
	 * serializeIp65504P2282L
	 */
	protected void serializeIp65504P2282L(short ip65504P2282L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2282L,IP_65504_P_2282_L_LEN)
                  ,beginIp65504P2282L
                  ,IP_65504_P_2282_L_LEN
                 );
            localIp65504P2282LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2282LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2282L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2282L() {	 
			return (getShort(beginIp65504P2282L));
   	}
         int localIp65504P2283SCounter = -1;
         public boolean isIp65504P2283SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2283SCounter != sharedCounter;
            localIp65504P2283SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2283_S_LEN = 2;
  	/**
	 * serializeIp65504P2283S
	 */
	protected void serializeIp65504P2283S(short ip65504P2283S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2283S,IP_65504_P_2283_S_LEN)
                  ,beginIp65504P2283S
                  ,IP_65504_P_2283_S_LEN
                 );
            localIp65504P2283SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2283SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2283S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2283S() {	 
			return (getShort(beginIp65504P2283S));
   	}
         int localIp65504P2283LCounter = -1;
         public boolean isIp65504P2283LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2283LCounter != sharedCounter;
            localIp65504P2283LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2283_L_LEN = 2;
  	/**
	 * serializeIp65504P2283L
	 */
	protected void serializeIp65504P2283L(short ip65504P2283L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2283L,IP_65504_P_2283_L_LEN)
                  ,beginIp65504P2283L
                  ,IP_65504_P_2283_L_LEN
                 );
            localIp65504P2283LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2283LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2283L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2283L() {	 
			return (getShort(beginIp65504P2283L));
   	}
         int localIp65504P2284SCounter = -1;
         public boolean isIp65504P2284SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2284SCounter != sharedCounter;
            localIp65504P2284SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2284_S_LEN = 2;
  	/**
	 * serializeIp65504P2284S
	 */
	protected void serializeIp65504P2284S(short ip65504P2284S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2284S,IP_65504_P_2284_S_LEN)
                  ,beginIp65504P2284S
                  ,IP_65504_P_2284_S_LEN
                 );
            localIp65504P2284SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2284SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2284S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2284S() {	 
			return (getShort(beginIp65504P2284S));
   	}
         int localIp65504P2284LCounter = -1;
         public boolean isIp65504P2284LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2284LCounter != sharedCounter;
            localIp65504P2284LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2284_L_LEN = 2;
  	/**
	 * serializeIp65504P2284L
	 */
	protected void serializeIp65504P2284L(short ip65504P2284L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2284L,IP_65504_P_2284_L_LEN)
                  ,beginIp65504P2284L
                  ,IP_65504_P_2284_L_LEN
                 );
            localIp65504P2284LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2284LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2284L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2284L() {	 
			return (getShort(beginIp65504P2284L));
   	}
         int localIp65504P2285SCounter = -1;
         public boolean isIp65504P2285SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2285SCounter != sharedCounter;
            localIp65504P2285SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2285_S_LEN = 2;
  	/**
	 * serializeIp65504P2285S
	 */
	protected void serializeIp65504P2285S(short ip65504P2285S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2285S,IP_65504_P_2285_S_LEN)
                  ,beginIp65504P2285S
                  ,IP_65504_P_2285_S_LEN
                 );
            localIp65504P2285SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2285SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2285S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2285S() {	 
			return (getShort(beginIp65504P2285S));
   	}
         int localIp65504P2285LCounter = -1;
         public boolean isIp65504P2285LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2285LCounter != sharedCounter;
            localIp65504P2285LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2285_L_LEN = 2;
  	/**
	 * serializeIp65504P2285L
	 */
	protected void serializeIp65504P2285L(short ip65504P2285L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2285L,IP_65504_P_2285_L_LEN)
                  ,beginIp65504P2285L
                  ,IP_65504_P_2285_L_LEN
                 );
            localIp65504P2285LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2285LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2285L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2285L() {	 
			return (getShort(beginIp65504P2285L));
   	}
         int localIp65504P2286SCounter = -1;
         public boolean isIp65504P2286SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2286SCounter != sharedCounter;
            localIp65504P2286SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2286_S_LEN = 2;
  	/**
	 * serializeIp65504P2286S
	 */
	protected void serializeIp65504P2286S(short ip65504P2286S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2286S,IP_65504_P_2286_S_LEN)
                  ,beginIp65504P2286S
                  ,IP_65504_P_2286_S_LEN
                 );
            localIp65504P2286SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2286SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2286S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2286S() {	 
			return (getShort(beginIp65504P2286S));
   	}
         int localIp65504P2286LCounter = -1;
         public boolean isIp65504P2286LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2286LCounter != sharedCounter;
            localIp65504P2286LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2286_L_LEN = 2;
  	/**
	 * serializeIp65504P2286L
	 */
	protected void serializeIp65504P2286L(short ip65504P2286L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2286L,IP_65504_P_2286_L_LEN)
                  ,beginIp65504P2286L
                  ,IP_65504_P_2286_L_LEN
                 );
            localIp65504P2286LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2286LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2286L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2286L() {	 
			return (getShort(beginIp65504P2286L));
   	}
         int localIp65504P2287SCounter = -1;
         public boolean isIp65504P2287SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2287SCounter != sharedCounter;
            localIp65504P2287SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2287_S_LEN = 2;
  	/**
	 * serializeIp65504P2287S
	 */
	protected void serializeIp65504P2287S(short ip65504P2287S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2287S,IP_65504_P_2287_S_LEN)
                  ,beginIp65504P2287S
                  ,IP_65504_P_2287_S_LEN
                 );
            localIp65504P2287SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2287SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2287S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2287S() {	 
			return (getShort(beginIp65504P2287S));
   	}
         int localIp65504P2287LCounter = -1;
         public boolean isIp65504P2287LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2287LCounter != sharedCounter;
            localIp65504P2287LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2287_L_LEN = 2;
  	/**
	 * serializeIp65504P2287L
	 */
	protected void serializeIp65504P2287L(short ip65504P2287L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2287L,IP_65504_P_2287_L_LEN)
                  ,beginIp65504P2287L
                  ,IP_65504_P_2287_L_LEN
                 );
            localIp65504P2287LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2287LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2287L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2287L() {	 
			return (getShort(beginIp65504P2287L));
   	}
         int localIp65504P2288SCounter = -1;
         public boolean isIp65504P2288SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2288SCounter != sharedCounter;
            localIp65504P2288SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2288_S_LEN = 2;
  	/**
	 * serializeIp65504P2288S
	 */
	protected void serializeIp65504P2288S(short ip65504P2288S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2288S,IP_65504_P_2288_S_LEN)
                  ,beginIp65504P2288S
                  ,IP_65504_P_2288_S_LEN
                 );
            localIp65504P2288SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2288SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2288S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2288S() {	 
			return (getShort(beginIp65504P2288S));
   	}
         int localIp65504P2288LCounter = -1;
         public boolean isIp65504P2288LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2288LCounter != sharedCounter;
            localIp65504P2288LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2288_L_LEN = 2;
  	/**
	 * serializeIp65504P2288L
	 */
	protected void serializeIp65504P2288L(short ip65504P2288L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2288L,IP_65504_P_2288_L_LEN)
                  ,beginIp65504P2288L
                  ,IP_65504_P_2288_L_LEN
                 );
            localIp65504P2288LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2288LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2288L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2288L() {	 
			return (getShort(beginIp65504P2288L));
   	}
         int localIp65504P2289SCounter = -1;
         public boolean isIp65504P2289SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2289SCounter != sharedCounter;
            localIp65504P2289SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2289_S_LEN = 2;
  	/**
	 * serializeIp65504P2289S
	 */
	protected void serializeIp65504P2289S(short ip65504P2289S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2289S,IP_65504_P_2289_S_LEN)
                  ,beginIp65504P2289S
                  ,IP_65504_P_2289_S_LEN
                 );
            localIp65504P2289SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2289SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2289S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2289S() {	 
			return (getShort(beginIp65504P2289S));
   	}
         int localIp65504P2289LCounter = -1;
         public boolean isIp65504P2289LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2289LCounter != sharedCounter;
            localIp65504P2289LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2289_L_LEN = 2;
  	/**
	 * serializeIp65504P2289L
	 */
	protected void serializeIp65504P2289L(short ip65504P2289L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2289L,IP_65504_P_2289_L_LEN)
                  ,beginIp65504P2289L
                  ,IP_65504_P_2289_L_LEN
                 );
            localIp65504P2289LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2289LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2289L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2289L() {	 
			return (getShort(beginIp65504P2289L));
   	}
         int localIp65504P2290SCounter = -1;
         public boolean isIp65504P2290SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2290SCounter != sharedCounter;
            localIp65504P2290SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2290_S_LEN = 2;
  	/**
	 * serializeIp65504P2290S
	 */
	protected void serializeIp65504P2290S(short ip65504P2290S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2290S,IP_65504_P_2290_S_LEN)
                  ,beginIp65504P2290S
                  ,IP_65504_P_2290_S_LEN
                 );
            localIp65504P2290SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2290SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2290S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2290S() {	 
			return (getShort(beginIp65504P2290S));
   	}
         int localIp65504P2290LCounter = -1;
         public boolean isIp65504P2290LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2290LCounter != sharedCounter;
            localIp65504P2290LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2290_L_LEN = 2;
  	/**
	 * serializeIp65504P2290L
	 */
	protected void serializeIp65504P2290L(short ip65504P2290L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2290L,IP_65504_P_2290_L_LEN)
                  ,beginIp65504P2290L
                  ,IP_65504_P_2290_L_LEN
                 );
            localIp65504P2290LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2290LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2290L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2290L() {	 
			return (getShort(beginIp65504P2290L));
   	}
         int localIp65504P2291SCounter = -1;
         public boolean isIp65504P2291SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2291SCounter != sharedCounter;
            localIp65504P2291SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2291_S_LEN = 2;
  	/**
	 * serializeIp65504P2291S
	 */
	protected void serializeIp65504P2291S(short ip65504P2291S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2291S,IP_65504_P_2291_S_LEN)
                  ,beginIp65504P2291S
                  ,IP_65504_P_2291_S_LEN
                 );
            localIp65504P2291SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2291SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2291S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2291S() {	 
			return (getShort(beginIp65504P2291S));
   	}
         int localIp65504P2291LCounter = -1;
         public boolean isIp65504P2291LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2291LCounter != sharedCounter;
            localIp65504P2291LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2291_L_LEN = 2;
  	/**
	 * serializeIp65504P2291L
	 */
	protected void serializeIp65504P2291L(short ip65504P2291L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2291L,IP_65504_P_2291_L_LEN)
                  ,beginIp65504P2291L
                  ,IP_65504_P_2291_L_LEN
                 );
            localIp65504P2291LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2291LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2291L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2291L() {	 
			return (getShort(beginIp65504P2291L));
   	}
         int localIp65504P2292SCounter = -1;
         public boolean isIp65504P2292SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2292SCounter != sharedCounter;
            localIp65504P2292SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2292_S_LEN = 2;
  	/**
	 * serializeIp65504P2292S
	 */
	protected void serializeIp65504P2292S(short ip65504P2292S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2292S,IP_65504_P_2292_S_LEN)
                  ,beginIp65504P2292S
                  ,IP_65504_P_2292_S_LEN
                 );
            localIp65504P2292SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2292SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2292S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2292S() {	 
			return (getShort(beginIp65504P2292S));
   	}
         int localIp65504P2292LCounter = -1;
         public boolean isIp65504P2292LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2292LCounter != sharedCounter;
            localIp65504P2292LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2292_L_LEN = 2;
  	/**
	 * serializeIp65504P2292L
	 */
	protected void serializeIp65504P2292L(short ip65504P2292L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2292L,IP_65504_P_2292_L_LEN)
                  ,beginIp65504P2292L
                  ,IP_65504_P_2292_L_LEN
                 );
            localIp65504P2292LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2292LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2292L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2292L() {	 
			return (getShort(beginIp65504P2292L));
   	}
         int localIp65504P2293SCounter = -1;
         public boolean isIp65504P2293SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2293SCounter != sharedCounter;
            localIp65504P2293SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2293_S_LEN = 2;
  	/**
	 * serializeIp65504P2293S
	 */
	protected void serializeIp65504P2293S(short ip65504P2293S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2293S,IP_65504_P_2293_S_LEN)
                  ,beginIp65504P2293S
                  ,IP_65504_P_2293_S_LEN
                 );
            localIp65504P2293SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2293SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2293S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2293S() {	 
			return (getShort(beginIp65504P2293S));
   	}
         int localIp65504P2293LCounter = -1;
         public boolean isIp65504P2293LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2293LCounter != sharedCounter;
            localIp65504P2293LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2293_L_LEN = 2;
  	/**
	 * serializeIp65504P2293L
	 */
	protected void serializeIp65504P2293L(short ip65504P2293L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2293L,IP_65504_P_2293_L_LEN)
                  ,beginIp65504P2293L
                  ,IP_65504_P_2293_L_LEN
                 );
            localIp65504P2293LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2293LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2293L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2293L() {	 
			return (getShort(beginIp65504P2293L));
   	}
         int localIp65504P2294SCounter = -1;
         public boolean isIp65504P2294SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2294SCounter != sharedCounter;
            localIp65504P2294SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2294_S_LEN = 2;
  	/**
	 * serializeIp65504P2294S
	 */
	protected void serializeIp65504P2294S(short ip65504P2294S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2294S,IP_65504_P_2294_S_LEN)
                  ,beginIp65504P2294S
                  ,IP_65504_P_2294_S_LEN
                 );
            localIp65504P2294SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2294SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2294S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2294S() {	 
			return (getShort(beginIp65504P2294S));
   	}
         int localIp65504P2294LCounter = -1;
         public boolean isIp65504P2294LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2294LCounter != sharedCounter;
            localIp65504P2294LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2294_L_LEN = 2;
  	/**
	 * serializeIp65504P2294L
	 */
	protected void serializeIp65504P2294L(short ip65504P2294L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2294L,IP_65504_P_2294_L_LEN)
                  ,beginIp65504P2294L
                  ,IP_65504_P_2294_L_LEN
                 );
            localIp65504P2294LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2294LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2294L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2294L() {	 
			return (getShort(beginIp65504P2294L));
   	}




}
  
