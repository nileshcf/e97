package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RldusInEocRefBlData extends RldusInEocRefBlDataSerialized {
   
				@Getter @Setter private RldusInEocRefBlDtl rldusInEocRefBlDtl = new RldusInEocRefBlDtl();
				@Getter @Setter private RldusInEocRefBlMsg rldusInEocRefBlMsg = new RldusInEocRefBlMsg();
				@Getter @Setter private RldusInEocTgp rldusInEocTgp = new RldusInEocTgp();
				@Getter @Setter private RldusInEocRefBlHdr rldusInEocRefBlHdr = new RldusInEocRefBlHdr();
				@Getter @Setter private RldusInEocRefBlTlr rldusInEocRefBlTlr = new RldusInEocRefBlTlr();
	
	/**
	* Constructor for RldusInEocRefBlData
	**/
    public RldusInEocRefBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRldusInEocRefBlDtl().setParent(this,getStartOffset() + 0);
					getRldusInEocRefBlMsg().setParent(this,getStartOffset() + 0);
					getRldusInEocTgp().setParent(this,getStartOffset() + 0);
					getRldusInEocRefBlHdr().setParent(this,getStartOffset() + 0);
					getRldusInEocRefBlTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
