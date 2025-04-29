package com.cloudframe.app.ar640010.dto;

/**
*  The class FtssFileName830 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FtssFileName830 extends FtssFileName830Serialized {
   

						@Getter @Setter private char[] ftssFileBulkId830 = new char[4];

						@Getter @Setter private char[] ftssFileEndptNo830 = new char[5];

						@Getter @Setter private char[] ftssFileJulDay830 = new char[3];
				@Getter @Setter private FtssFileSeqNum830 ftssFileSeqNum830 = new FtssFileSeqNum830();
	
	/**
	* Constructor for FtssFileName830
	**/
    public FtssFileName830() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFtssFileSeqNum830().setParent(this,getStartOffset() + 12);
	   	/*  end of offset */
								setFtssFileBulkId830(fillSpace(4));
								setFtssFileEndptNo830(fillSpace(5));
								setFtssFileJulDay830(fillSpace(3));
							getFtssFileSeqNum830().setString(fillSpace(2));
    }





}
  
