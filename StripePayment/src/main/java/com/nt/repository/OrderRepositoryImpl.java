/*
 * package com.nt.repository;
 * 
 * import java.awt.print.Pageable; import java.util.List; import
 * java.util.Optional; import java.util.function.Function;
 * 
 * import
 * org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
 * import org.springframework.data.domain.Example; import
 * org.springframework.data.domain.Page; import
 * org.springframework.data.repository.query.FluentQuery; import
 * org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
 * import org.springframework.stereotype.Repository;
 * 
 * import com.nt.model.Order;
 * 
 * @Repository public class OrderRepositoryImpl implements IOrderRepository {
 * 
 * @Override public List<Order> findAll() { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public List<Order> findAll(org.springframework.data.domain.Sort
 * sort) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public Page<Order> findAll(org.springframework.data.domain.Pageable
 * pageable) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public List<Order> findAllById(Iterable<Long> longs) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public long count() { // TODO Auto-generated method stub return 0;
 * }
 * 
 * @Override public void deleteById(Long aLong) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void delete(Order entity) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void deleteAllById(Iterable<? extends Long> longs) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAll(Iterable<? extends Order> entities) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAll() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public <S extends Order> S save(S entity) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public <S extends Order> List<S> saveAll(Iterable<S> entities) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public Optional<Order> findById(Long aLong) { // TODO
 * Auto-generated method stub return Optional.empty(); }
 * 
 * @Override public boolean existsById(Long aLong) { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public void flush() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public <S extends Order> S saveAndFlush(S entity) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public <S extends Order> List<S> saveAllAndFlush(Iterable<S>
 * entities) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public void deleteAllInBatch(Iterable<Order> entities) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAllByIdInBatch(Iterable<Long> longs) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAllInBatch() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public Order getOne(Long aLong) { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public Order getById(Long aLong) { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public Order getReferenceById(Long aLong) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public <S extends Order> Optional<S> findOne(Example<S> example) {
 * // TODO Auto-generated method stub return Optional.empty(); }
 * 
 * @Override public <S extends Order> List<S> findAll(Example<S> example) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends Order> List<S> findAll(Example<S> example,
 * org.springframework.data.domain.Sort sort) { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public <S extends Order> Page<S> findAll(Example<S> example,
 * org.springframework.data.domain.Pageable pageable) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public <S extends Order> long count(Example<S> example) { // TODO
 * Auto-generated method stub return 0; }
 * 
 * @Override public <S extends Order> boolean exists(Example<S> example) { //
 * TODO Auto-generated method stub return false; }
 * 
 * @Override public <S extends Order, R> R findBy(Example<S> example,
 * Function<FetchableFluentQuery<S>, R> queryFunction) { // TODO Auto-generated
 * method stub return null; }
 * 
 * // Implement the methods of the OrderRepository interface }
 */