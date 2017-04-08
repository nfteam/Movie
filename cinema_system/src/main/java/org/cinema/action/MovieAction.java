package org.cinema.action;

import org.cinema.condition.MovieCondition;
import org.cinema.dao.MovieDao;
import org.cinema.service.MovieService;
import org.domian.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
@Controller("movieAction")
@Scope("prototype")
public class MovieAction {

    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieDao movieDao;
    private Movie movie;
    private List<Movie> list=new ArrayList<>();
    private MovieCondition condition;
    private int page=1; //默认页数
    private int max=2; //每页多少条
    private Long count; //总记录数
    private int totalPage; //多少页

    public List<Movie> getList() {
        return list;
    }

    public void setList(List<Movie> list) {
        this.list = list;
    }

    public MovieCondition getCondition() {
        return condition;
    }

    public void setCondition(MovieCondition condition) {
        this.condition = condition;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String findList(){
        count();
        page= (int) ((page-1)*count);
        list=movieDao.findMovieList(page,max);
        return "success";
    }


    public String findMovieByCondition(){
        list=movieService.findMovieCondition(condition);
        System.out.println(list.size());
        return "success";
    }

    public String  count(){
       count=(long)movieDao.countMovie().get(0);
        totalPage = (int)(count%max)>0  ? (int)(count/max)+1 :(int)(count/max);
        System.out.println(totalPage);
       return "success";
    }

    public String movieList(){
        list=movieDao.movieList();
        System.out.println(list.size());
        return "success";
    }

    public String findMovieById(){
        movie=movieDao.findById(Movie.class,movie.getMovId());
        return "success";
    }
}
