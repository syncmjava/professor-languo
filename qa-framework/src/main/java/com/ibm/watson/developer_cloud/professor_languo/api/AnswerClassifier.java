/*
 * Copyright IBM Corp. 2015
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ibm.watson.developer_cloud.professor_languo.api;


/**
 * A classifier is an answer generator that requires training.
 * 
 * Classifier is the interface for all question answer classifiers, which can be trained against a
 * training set, and predict answer to a given question along with the corresponding confidence
 * values.
 * 
 */
public interface AnswerClassifier extends AnswerGenerator, TrainableComponent {

}
