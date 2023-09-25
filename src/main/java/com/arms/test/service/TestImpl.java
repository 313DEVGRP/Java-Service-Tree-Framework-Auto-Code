/*
 * @author Dongmin.lee
 * @since 2023-09-25
 * @version 23.09.25
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.test.service;

import com.egovframework.javaservice.treeframework.service.TreeServiceImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import com.arms.test.dao.TestRepository;


@Slf4j
@AllArgsConstructor
@Service("test")
public class TestImpl extends TreeServiceImpl implements Test{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private final TestRepository testRepository;

}