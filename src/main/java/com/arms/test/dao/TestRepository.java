/*
 * @author Dongmin.lee
 * @since 2024-01-25
 * @version 24.01.25
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.test.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TestRepository {
    private final TestJpaRepository testJpaRepository;

}