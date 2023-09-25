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
package com.arms.test.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.arms.test.model.TestEntity;

public interface TestJpaRepository extends JpaRepository<TestEntity,Long>, JpaSpecificationExecutor<TestEntity> {

}