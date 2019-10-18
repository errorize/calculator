package com.micro2816.action;

import org.apache.log4j.Logger;

import com.micro2816.api.PermutationIteratorHandler;

/**
 * @see a default handler for permutation iteration
 * @author Micro
 * @since 2019年10月18日 上午10:00:30
 * @version V1.0
 * @copyright 
 *
 */
public class DefaultPermutationIteratorHandler implements PermutationIteratorHandler {
    private static final Logger logger = Logger.getLogger(DefaultPermutationIteratorHandler.class);
    @Override
    public void handle(char []letters) {
//        System.err.print(new String(letters) + " ");
        logger.info(new String(letters));
    }

}
